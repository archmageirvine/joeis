package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000622.
 * @author Sean A. Irvine
 */
public class A000622 extends A000620 {

  @Override
  public Z next() {
    super.next();
    return mSs.get(mN);
  }
}
