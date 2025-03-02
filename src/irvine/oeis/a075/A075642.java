package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075616.
 * @author Sean A. Irvine
 */
public class A075642 extends A075639 {

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
