package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058978.
 * @author Sean A. Irvine
 */
public class A058980 extends A058979 {

  @Override
  public Z next() {
    while (!super.next().isZero()) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
