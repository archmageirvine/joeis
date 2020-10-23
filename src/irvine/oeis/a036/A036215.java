package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a000.A000244;

/**
 * A036215.
 * @author Sean A. Irvine
 */
public class A036215 extends A000244 {

  @Override
  public Z next() {
    return new Z(new StringBuilder(super.next().toString(2)).reverse(), 2);
  }
}
