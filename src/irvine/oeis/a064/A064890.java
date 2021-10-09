package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a051.A051451;

/**
 * A064890 Decimal expansion of the sum of reciprocals of A051451, which includes 1 and values of lcm(1,...,x), where x is a prime power (A000961).
 * @author Sean A. Irvine
 */
public class A064890 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A064890() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = Z.ONE.shiftLeft(-precision);
        final Sequence lcm = new A051451();
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
