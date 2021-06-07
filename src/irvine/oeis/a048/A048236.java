package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048236 a(n)=T(n,1)+T(n,n), array T given by A048225.
 * @author Sean A. Irvine
 */
public class A048236 extends A048224 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.multiply2().subtract(t).subtract(1);
  }
}
