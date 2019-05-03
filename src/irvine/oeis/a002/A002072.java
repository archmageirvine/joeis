package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002072 <code>a(n) =</code> smallest number m such that for all k <code>&gt</code>; m, either k or <code>k+1</code> has a prime factor <code>&gt; prime(n)</code>.
 * @author Sean A. Irvine
 */
public class A002072 extends A002071 {

  @Override
  public Z next() {
    super.next();
    return mLargestSolution;
  }
}
