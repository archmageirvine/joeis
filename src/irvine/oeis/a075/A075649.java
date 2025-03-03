package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075649 Right side of the triangle A075652.
 * @author Sean A. Irvine
 */
public class A075649 extends A075652 {

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
