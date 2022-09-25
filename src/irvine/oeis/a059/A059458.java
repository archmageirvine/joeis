package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059458 A binary sequence: a(1) = 10 (2 in decimal) and a(n+1) is obtained by trying to complement just one bit of a(n), starting with the least significant bit, until a new prime is reached.
 * @author Sean A. Irvine
 */
public class A059458 extends A059459 {

  @Override
  public Z next() {
    return new Z(super.next().toString(2));
  }
}
