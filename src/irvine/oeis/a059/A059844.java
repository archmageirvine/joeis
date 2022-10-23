package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059844 a(n) = smallest nonzero square x^2 such that n+x^2 is prime.
 * @author Sean A. Irvine
 */
public class A059844 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z m = Z.ZERO;
    while (true) {
      m = m.add(1);
      final Z s = m.square();
      if (s.add(mN).isProbablePrime()) {
        return s;
      }
    }
  }
}
