package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075648 Left side of the triangle A075652.
 * @author Sean A. Irvine
 */
public class A075648 extends A075652 {

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
