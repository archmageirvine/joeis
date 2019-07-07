package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a020.A020885;

/**
 * A024406 Ordered areas of primitive Pythagorean triangles.
 * @author Sean A. Irvine
 */
public class A024406 extends A020885 {

  @Override
  public Z next() {
    return super.next().multiply(6);
  }
}
