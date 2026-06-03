package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001122;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085108 Decimal expansion of sum 1/(p*2^p) where p runs through the set of Artin primes (primes with primitive root 2).
 * @author Sean A. Irvine
 */
public class A085108 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A085108() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence s = new A001122();
        final Z one = CR.ONE.getApprox(precision);
        Z sum = Z.ZERO;
        while (true) {
          final Z p = s.next();
          final Z t = one.divide(p).shiftRight(p.longValueExact());
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}

