package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002113;

/**
 * A084352 Minimum digit out of both prime factors of palindromic brilliant numbers.
 * @author Sean A. Irvine
 */
public class A084352 extends Sequence0 {

  private final Sequence mPalindromes = new A002113().skip(2);

  private long minDigit(final Z n) {
    int syn = Functions.SYNDROME.i(n);
    for (int d = 0; d < 10; ++d) {
      if ((syn & 1) == 1) {
        return d;
      }
      syn >>>= 1;
    }
    throw new RuntimeException();
  }

  @Override
  public Z next() {
    while (true) {
      final Z palin = mPalindromes.next();
      if (Predicates.BRILLIANT.is(palin)) {
        long min = 10;
        for (final Z p : Jaguar.factor(palin).toZArray()) {
          min = Math.min(min, minDigit(p));
        }
        return Z.valueOf(min);
      }
    }
  }
}

