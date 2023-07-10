package irvine.oeis.a126;

import irvine.math.z.Z;

/**
 * A126556 Arithmetic mean of two consecutive prime interprimes of second order: interprimes of third order.
 * @author Sean A. Irvine
 */
public class A126556 extends A126555 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z a = mA;
    mA = super.next();
    return mA.add(a).divide2();
  }
}
