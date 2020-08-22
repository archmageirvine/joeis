package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001014;

/**
 * A024004 a(n) = 1 - n^6.
 * @author Sean A. Irvine
 */
public class A024004 extends A001014 {

  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}
