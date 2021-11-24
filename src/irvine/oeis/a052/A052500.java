package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052500 A052484 / 9.
 * @author Sean A. Irvine
 */
public class A052500 extends A052484 {

  @Override
  public Z next() {
    return super.next().divide(9);
  }
}
