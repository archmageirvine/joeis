package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058921.
 * @author Sean A. Irvine
 */
public class A058925 extends A058924 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
