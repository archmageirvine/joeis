package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A060388 Decimal expansion of alpha(2) = Sum_{i&gt;0} prime(i)*2^(-i^2).
 * @author Sean A. Irvine
 */
public class A060388 extends DecimalExpansionSequence {

  private static final int EXTRA_PRECISION = 5;

  /** Construct the sequence. */
  public A060388() {
    super(new CR() {
      private final Fast mPrime = new Fast();

      @Override
      protected Z approximate(final int precision) {
        final int prec = -precision + EXTRA_PRECISION;
        Z sum = Z.ZERO;
        int k = 0;
        Z p = Z.ONE;
        while (true) {
          p = mPrime.nextPrime(p);
          final Z t = p.shiftLeft(prec - ++k * k);
          if (t.isZero()) {
            break;
          }
          sum = sum.add(t);
        }
        return sum.shiftRight(EXTRA_PRECISION);
      }
    });
  }
}
