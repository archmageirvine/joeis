package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A066747 Decimal expansion of the "binary" Copeland-Erd\u0151s constant 0.734121515408286120606...: concatenate primes in base two.
 * @author Sean A. Irvine
 */
public class A066747 extends DecimalExpansionSequence {

  private static final Fast PRIME = new Fast();

  /** Construct the sequence. */
  public A066747() {
    super(new CR() {
      @Override
      protected Z approximate(final int precision) {
        if (precision >= 0) {
          return Z.ZERO;
        }
        final StringBuilder s = new StringBuilder();
        long p = 1;
        while (s.length() < -precision) {
          p = PRIME.nextPrime(p);
          s.append(Long.toBinaryString(p));
        }
        return new Z(s, 2).shiftRight(s.length() + precision);
      }
    });
  }
}
