package irvine.oeis;

import java.io.Serializable;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * Sequence formed by the decimal expansion of a computable real number.
 * @author Sean A. Irvine
 */
public class DecimalExpansionSequence extends RealConstantSequence implements Serializable {

  private final int mBase;
  private String mS = "";
  protected int mN = -1;
  private boolean mSeenNonZero;

  private DecimalExpansionSequence(final boolean zeroHandling, final int base) {
    super(0, null);
    mSeenNonZero = zeroHandling;
    mBase = base;
  }

  // todo remove this constructor
  protected DecimalExpansionSequence(final boolean zeroHandling) {
    this(zeroHandling, 10);
  }

  // todo remove this constructor
  protected DecimalExpansionSequence() {
    this(true, 10);
  }

  /**
   * Construct a new expansion of a computable real number.
   * @param offset OEIS offset
   * @param x the number
   * @param base base for expansion
   */
  public DecimalExpansionSequence(final int offset, final CR x, final int base) {
    // "offset" here is supposed to be number of digits before decimal point.
    // For us anything non-negative means we generate straight away, but a
    // negative value means we should skip some leading 0s
    super(offset, x);
    mBase = base;
    // We want to set mN to one less than first term to generate from the expansion.
    // For most numbers (non-negative offset) we want to start generating from the
    // first digit of the expansion.  But if the offset is negative -- e.g. for a
    // constant like 0.0001 -- we need to skip the leading zeros.
    // Caveat: some offsets in the OEIS and likely incorrect!
    mN = offset >= 0 ? -1 : 1 - offset;
    mSeenNonZero = true; // todo remove this flag once everything is going via this path
  }

  protected DecimalExpansionSequence(final int offset, final CR x) {
    this(offset, x, 10);
  }

  protected DecimalExpansionSequence(final CR x) {
    this(1, x);
  }

  protected void ensureAccuracy(final int n) {
  }
  
  private void updateString() {
    // The 32 below is number of extra digits to ensure we have in the queue.
    // In pathological cases this might not be enough, and if we ever find
    // such a number in the OEIS we will need another parameter to control this
    // heuristic.
    while (mN >= mS.length() - 32) {
      final int newLength = 2 * mS.length() + 1;
      ensureAccuracy(newLength);
      mS = getCR().toString(newLength, mBase);
    }
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      updateString();
      final char c = mS.charAt(mN);
      if (c == '.') {
        // Skip any decimal point
        continue;
      }
      if (c == '0' && (mN == 0 || !mSeenNonZero)) {
        // Skip leading zeros
        continue;
      }
      mSeenNonZero = true;
      return Z.valueOf(c <= '9' ? c - '0' : c - 'a' + 10);
    }
  }
}
