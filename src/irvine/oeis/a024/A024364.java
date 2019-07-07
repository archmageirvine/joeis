package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a020.A020886;

/**
 * A024364 Ordered perimeters of primitive Pythagorean triangles.
 * @author Sean A. Irvine
 */
public class A024364 extends A020886 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
