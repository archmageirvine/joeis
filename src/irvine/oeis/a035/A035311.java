package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035311 First column of the Zorach additive triangle A035312.
 * @author Sean A. Irvine
 */
public class A035311 extends A035312 {

  private long mN = -1;

  @Override
  public Z next() {
    // We need to make sure the entire triangle is constructed
    if (mN > 0) {
      get(mN, mN);
    }
    return get(++mN, 0L);
  }
}
