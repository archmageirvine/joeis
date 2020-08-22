package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a008.A008456;

/**
 * A024010 a(n) = 1 - n^12.
 * @author Sean A. Irvine
 */
public class A024010 extends A008456 {

  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}
