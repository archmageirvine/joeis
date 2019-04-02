package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014419 Write n in base of Catalan numbers, then interpret as if written in base 3.
 * @author Sean A. Irvine
 */
public class A014419 extends A014418 {

  @Override
  public Z next() {
    return new Z(super.next().toString(), 3);
  }
}
