package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056135 Smallest positive integer other than n where geometric mean of n and a(n) is an integer.
 * @author Sean A. Irvine
 */
public class A056135 extends A056134 {

  @Override
  public Z next() {
    return super.next().square().divide(mN);
  }
}
