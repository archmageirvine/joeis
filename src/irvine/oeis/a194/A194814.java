package irvine.oeis.a194;
// manually 2025-02-23

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * A194814 Number of integers k in [1,n] such that {n*r+k*r} &gt; {n*r-k*r}, where { } = fractional part and r=(1+sqrt(5))/2 (the golden ratio).
 * @author Georg Fischer
 */
public class A194814 extends A194733 {

  /** Construct the sequence. */
  public A194814() {
    this(1, CR.PHI, 1);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param r constant factor
   * @param rel relation: 1 for ">", -1 for "<" 
   */
  public A194814(final int offset, final CR r, final int rel) {
    super(offset, r, rel);
  }

  @Override
  public Z next() {
    final CR rN = mR.multiply(++mN);
    mRK.add(rN);
    int sum = 0;
    if (mRel > 0) {
      for (int k = 1; k < mN; ++k) {
        if (rN.add(mRK.get(k)).frac(mFrac).compareTo(rN.subtract(mRK.get(k)).frac(mFrac), mPrec) > 0) {
          ++sum;
        }
        //System.out.println("n,k=" + mN + "," + k + ", rN=" + rN + ", mRK=" + mRK.get(k) + ", sum=" + sum);
      }
      ++sum; // because we left out k == n
    } else {
      for (int k = 1; k < mN; ++k) {
        if (rN.add(mRK.get(k)).frac(mFrac).compareTo(rN.subtract(mRK.get(k)).frac(mFrac), mPrec) < 0) {
          ++sum;
        }  
      }
      ++sum; // why?
    }
    return Z.valueOf(sum);
  }
}
