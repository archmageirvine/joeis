package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000668;

/**
 * A059305 a(n) = pi(Mersenne(n)): index of n-th Mersenne prime.
 * @author Sean A. Irvine
 */
public class A059305 extends A000040 {

  private final Sequence mMersenne = new A000668();
  private long mN = 0;

  @Override
  public Z next() {
    final Z m = mMersenne.next();
    while (true) {
      ++mN;
      if (m.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
