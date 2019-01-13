package irvine.oeis;

import java.io.Serializable;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * Sequence formed by the decimal expansion of a computable real number.
 * @author Sean A. Irvine
 */
public abstract class DecimalExpansionSequence implements Sequence, Serializable {

  private final int mBase;
  private String mS = "";
  protected int mN = -1;
  private boolean mSeenNonZero;

  protected DecimalExpansionSequence(final boolean zeroHandling, final int base) {
    mSeenNonZero = zeroHandling;
    mBase = base;
  }

  protected DecimalExpansionSequence(final boolean zeroHandling) {
    this(zeroHandling, 10);
  }

  protected DecimalExpansionSequence() {
    this(true, 10);
  }

  protected abstract CR getCR();

  protected void ensureAccuracy(final int n) {
  }
  
  private void updateString() {
    // The 32 below is number of extra digits to ensure we have in the
    // queue, this can handle rounding issues
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
