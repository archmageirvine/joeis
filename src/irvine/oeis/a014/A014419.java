package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014419.
 * @author Sean A. Irvine
 */
public class A014419 extends A014418 {

  @Override
  public Z next() {
    return new Z(super.next().toString(), 3);
  }
}
