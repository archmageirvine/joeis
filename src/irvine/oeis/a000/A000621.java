package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000621.
 * @author Sean A. Irvine
 */
public class A000621 extends A000620 {

  @Override
  public Z next() {
    super.next();
    return mPn.get(mN);
  }
}
