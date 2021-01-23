package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019434 Fermat primes: primes of the form 2^(2^k) + 1, for some k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A019434 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 31) {
        throw new UnsupportedOperationException();
      }
      final Z f = Z.ONE.shiftLeft(1 << mN).add(1);
      if (f.isProbablePrime()) {
        return f;
      }
    }
  }
}

