package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075384 extends A075383 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z res = super.next();
    for (long k = 1; k < mN; ++k) {
      super.next();
    }
    return res;
  }
}
