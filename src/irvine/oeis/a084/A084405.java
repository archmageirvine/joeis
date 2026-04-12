package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A084405 Primes whose sum of factorials of digits is also prime.
 * @author Sean A. Irvine
 */
public class A084405 extends FilterSequence {

  /** Construct the sequence. */
  public A084405() {
    super(1, new A000040(), p -> {
      Z sum = Z.ZERO;
      while (!p.isZero()) {
        final Z[] qr = p.divideAndRemainder(10);
        sum = sum.add(Functions.FACTORIAL.z(qr[1]));
        p = qr[0];
      }
      return sum.isProbablePrime();
    });
  }
}
