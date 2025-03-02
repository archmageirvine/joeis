package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075616.
 * @author Sean A. Irvine
 */
public class A075638 extends A075635 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}
