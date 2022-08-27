package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002110;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A064648 Decimal expansion of sum of reciprocals of primorial numbers: 1/2 + 1/6 + 1/30 + 1/210 + ... = 0.7052301717918009651474316828882485137435776391...
 * @author Sean A. Irvine
 */
public class A064648 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A064648() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = Z.ONE.shiftLeft(-precision);
        final Sequence primorials = new A002110();
        primorials.next();
        Z sum = Z.ZERO;
        while (true) {
          final Z t = one.divide(primorials.next());
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
