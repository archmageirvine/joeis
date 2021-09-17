package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051518 Perimeters of Heronian triangles.
 * @author Sean A. Irvine
 */
public class A051518 extends A051516 {

  @Override
  public Z next() {
    while (super.next().isZero()) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
