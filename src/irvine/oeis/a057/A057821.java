package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A057821 a(n) is the least nonnegative integer k such that 2^n - k is a safe prime.
 * @author Sean A. Irvine
 */
public class A057821 extends Sequence3 {

  private int mN = 2;

  @Override
  public Z next() {
    final Z t = Z.ONE.shiftLeft(++mN);
    long k = 0;
    while (true) {
      final Z s = t.subtract(++k);
      if (s.isProbablePrime() && s.divide2().isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
