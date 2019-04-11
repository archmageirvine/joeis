package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003517 Number of permutations of <code>[n+1]</code> with exactly 1 increasing subsequence of length 3.
 * @author Sean A. Irvine
 */
public class A003517 extends A003516 {

  @Override
  public Z next() {
    return super.next().multiply(6).divide(mN + 4);
  }
}
