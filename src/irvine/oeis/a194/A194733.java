package irvine.oeis.a194;
// manually 2025-02-23

import java.util.ArrayList;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A194733 Number of k &lt; n such that {k*r} &gt; {n*r}, where { } = fractional part, r = (1+sqrt(5))/2 (the golden ratio).
 * @author Georg Fischer
 */
public class A194733 extends AbstractSequence {

  protected int mN;
  protected final CR mR;
  protected final int mRel;
  protected final ArrayList<CR> mRK;
  protected final int mScale = 1;
  protected final int mPrec = -32;
  protected final int mFrac = 32;

  /** Construct the sequence. */
  public A194733() {
    this(1, CR.PHI, 1);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param r constant factor
   * @param rel relation: 1 for "&gt;", -1 for "&lt;"
   */
  public A194733(final int offset, final CR r, final int rel) {
    super(offset);
    mN = offset - 1;
    mR = r;
    mRel = rel;
    mRK = new ArrayList<>();
    mRK.add(CR.ZERO); // [0] is not used
  }

  @Override
  public Z next() {
    final CR rN = mR.multiply(++mN).frac(mFrac);
    mRK.add(rN);
    int sum = 0;
    if (mRel > 0) { // >
      for (int k = 1; k <= mN; ++k) {
        if (mRK.get(k).compareTo(rN, mPrec) > 0) {
          ++sum;
        }
      }
    } else { // <
      for (int k = 1; k <= mN; ++k) {
        if (mRK.get(k).compareTo(rN, mPrec) < 0) {
          ++sum;
        }  
      }
      ++sum; // why?
    }
    // System.out.println("n,k=" + mN + "," + k + ", rN=" + rN + ", mRK=" + mRK.get(k) + ", sum=" + sum);
    return Z.valueOf(sum);
  }
}
