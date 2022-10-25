package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060097.
 * @author Sean A. Irvine
 */
public class A060110 extends A060109 {

  @Override
  public Z next() {
    return new Z(super.next().toString(), 3);
  }
}
