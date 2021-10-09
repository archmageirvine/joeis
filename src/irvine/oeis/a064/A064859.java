package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003418;

/**
 * A064859 Decimal expansion of sum of reciprocals of lcm(1..n) = A003418(n).
 * @author Sean A. Irvine
 */
public class A064859 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A064859() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = Z.ONE.shiftLeft(-precision);
        final Sequence lcm = new A003418();
        lcm.next();
        Z sum = Z.ZERO;
        while (true) {
          final Z t = one.divide(lcm.next());
          if (t.isZero()) {
            break;
          }
          sum = sum.add(t);
        }
        return sum;
      }
    });
  }
}
