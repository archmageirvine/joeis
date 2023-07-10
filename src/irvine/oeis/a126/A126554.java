package irvine.oeis.a126;

import irvine.math.z.Z;
import irvine.oeis.a006.A006562;

/**
 * A126554 Arithmetic mean of two consecutive balanced primes (of order one).
 * @author Sean A. Irvine
 */
public class A126554 extends A006562 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z a = mA;
    mA = super.next();
    return mA.add(a).divide2();
  }
}
