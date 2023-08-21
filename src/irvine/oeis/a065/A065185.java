package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065185 The delta sequence p(i)-i for the "Greedy Queens" permutation A065188. Each queen at file n is situated at rank n+a(n).
 * @author Sean A. Irvine
 */
public class A065185 extends A065188 {

  @Override
  public Z next() {
    return super.next().subtract(mN);
  }
}
