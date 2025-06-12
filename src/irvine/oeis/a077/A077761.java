package irvine.oeis.a077;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A077761 Decimal expansion of Mertens's constant, which is the limit of (Sum_{i=1..k} 1/prime(i)) - log(log(prime(k))) as k goes to infinity, where prime(i) is the i-th prime number.
 * @author Sean A. Irvine
 */
public class A077761 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A077761() {
    super(0, CR.GAMMA.subtract(new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        int k = 1;
        while (true) {
          final Z t = Zeta.zetap(++k).divide(k).getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    }));
  }
}

