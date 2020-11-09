package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A036603 a(n) = n! in binary.
 * @author Sean A. Irvine
 */
public class A036603 extends A000142 {

  @Override
  public Z next() {
    return new Z(super.next().toString(2));
  }
}
