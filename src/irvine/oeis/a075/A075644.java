package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075644 Final terms of groups in A075643.
 * @author Sean A. Irvine
 */
public class A075644 extends A075647 {

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
