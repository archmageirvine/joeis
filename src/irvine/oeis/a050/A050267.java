package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050267 Primes or negative values of primes in the sequence b(n) = 47*n^2 - 1701*n + 10181, n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A050267 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).multiply(47).subtract(1701).multiply(mN).add(10181);
      if (t.abs().isProbablePrime()) {
        return t;
      }
    }
  }
}

