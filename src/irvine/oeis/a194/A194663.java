package irvine.oeis.a194;
// manually 2025-02-23

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * A194663 Number of k in [1,n] for which &lt;r^n&gt;+&lt;r^k&gt; &gt; 1, where &lt; > = fractional part and r = (1+sqrt(5))/2 (the golden ratio); row sums of A164661. 
 * @author Georg Fischer
 */
public class A194663 extends A194733 {

  /** Construct the sequence. */
  public A194663() {
    this(1, CR.SQRT2, 1);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param r constant factor
   * @param rel relation: 1 for ">", -1 for "<" 
   */
  public A194663(final int offset, final CR r, final int rel) {
    super(offset, r, rel);
  }

  @Override
  public Z next() {
    final CR rN = mR.pow(++mN).frac(mFrac);
    mRK.add(rN);
    int sum = 0;
    if (mRel > 0) { // >
      for (int k = 1; k <= mN; ++k) {
        if (mRK.get(k).add(rN).compareTo(CR.ONE, mPrec) > 0) {
          ++sum;
        }
      }
    } else { // < 
      for (int k = 1; k <= mN; ++k) {
        if (mRK.get(k).add(rN).compareTo(CR.ONE, mPrec) < 0) {
          ++sum;
        }  
      }
      ++sum; // why?
    }
    return Z.valueOf(sum);
  }
}
