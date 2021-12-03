package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052998 A052902 / 18.
 * @author Sean A. Irvine
 */
public class A052998 extends A052902 {

  @Override
  public Z next() {
    return super.next().divide(18);
  }
}

