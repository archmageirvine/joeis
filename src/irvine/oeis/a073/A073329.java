package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a048.A048692;

/**
 * A073329 a(n) is the n-th number to have n distinct prime factors.
 * @author Sean A. Irvine
 */
public class A073329 extends A048692 {

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

