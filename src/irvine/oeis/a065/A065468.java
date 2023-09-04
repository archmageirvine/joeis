package irvine.oeis.a065;

import java.util.function.Function;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A065468 Decimal expansion of Product_{p prime} (1 - 1/(p^5*(p+1))).
 * @author Sean A. Irvine
 */
public class A065468 extends DecimalExpansionSequence {

  protected A065468(final long[] kernel, final long[] initialTerms, final int zeros, final CR m, final Function<Integer, CR> p) {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final LinearRecurrence rec = new LinearRecurrence(kernel, initialTerms, new long[Math.max(0, zeros)]);
        if (zeros < 0) {
          rec.skip(-zeros);
        }
        int k = 2;
        Z sum = Z.ZERO;
        while (true) {
          ++k;
          final Z r = rec.next();
          if (!r.isZero()) {
            final Z t = p.apply(k - 1).multiply(r).getApprox(precision).divide(k - 1);
            if (t.isZero()) {
              break;
            }
            sum = sum.add(t);
          }
        }
        return sum;
      }
    }.exp().multiply(m));
  }

  /** Construct the sequence. */
  protected A065468(final long[] kernel, final long[] initialTerms, final int zeros, final CR m) {
    this(kernel, initialTerms, zeros, m, Zeta::zetap);
  }

  /** Construct the sequence. */
  protected A065468(final long[] kernel, final long[] initialTerms, final int zeros) {
    this(kernel, initialTerms, zeros, CR.ONE);
  }

  /** Construct the sequence. */
  public A065468() {
    this(new long[] {1, 1, 0, 0, 0, -1, -2}, new long[] {-6, 7, -8, 9, -10, 11, -18}, 4);
  }
}
