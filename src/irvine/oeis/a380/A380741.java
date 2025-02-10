package irvine.oeis.a380;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A074598.
 * @author Sean A. Irvine
 */
public class A380741 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A380741() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence primes = new A000040();
        Z sum = Z.ZERO;
        long k = 0;
        while (true) {
          final Z t = primes.next().shiftLeft(-precision - Functions.FACTORIAL.l(++k));
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
