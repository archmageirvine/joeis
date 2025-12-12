package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082537 Cubes arising in A082536.
 * @author Sean A. Irvine
 */
public class A082537 extends A082536 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.multiply(mA).add(1).root(3);
  }
}
