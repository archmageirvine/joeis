package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057097 Products of the three sides of Pythagorean triangles divided by 60.
 * @author Sean A. Irvine
 */
public class A057097 extends A057096 {

  @Override
  public Z next() {
    return super.next().divide(60);
  }
}
