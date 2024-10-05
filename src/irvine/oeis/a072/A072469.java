package irvine.oeis.a072;

import irvine.math.z.Z;

/**
 * A072106.
 * @author Sean A. Irvine
 */
public class A072469 extends A072467 {

  private long mN = -2;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}

