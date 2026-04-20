package irvine.oeis.a157;

import irvine.math.z.Z;

/**
 * A157276 a(n) = A157107(n) - 220*n.
 * @author Sean A. Irvine
 */
public class A157276 extends A157107 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 220;
    return super.next().subtract(mN);
  }
}
