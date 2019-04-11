package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002072 <code>a(n) =</code> smallest number m such that for all k &gt; m, either k or k+1 has a prime factor &gt; prime(n).
 * @author Sean A. Irvine
 */
public class A002072 extends A002071 {

  @Override
  public Z next() {
    super.next();
    return mLargestSolution;
  }
}
