package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084727 Primes arising in A084726.
 * @author Sean A. Irvine
 */
public class A084727 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long d = 0;
    while (true) {
      ++d;
      Z prod = Z.ONE;
      for (long k = 1; k < mN; ++k) {
        prod = prod.multiply(1 + k * d);
      }
      final Z t = prod.add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
