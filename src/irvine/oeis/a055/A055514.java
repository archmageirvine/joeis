package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a034.A034706;
import irvine.oeis.a050.A050936;

/**
 * A055514 Composite numbers that are the sum of consecutive prime numbers and are divisible by the first and last of these primes.
 * @author Sean A. Irvine
 */
public class A055514 extends A050936 {

  @Override
  protected boolean accept(final A034706.State s) {
    Z t = s.getValue();
    if (t.isProbablePrime()) {
      return false;
    }
    int k = s.getLast();
    if (!s.getValue().mod(mSeq.a(k)).isZero()) {
      return false;
    }
    while (!t.isZero()) {
      t = t.subtract(mSeq.a(k--));
    }
    return s.getValue().mod(mSeq.a(k + 1)).isZero();
  }
}
