package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A084119 Decimal expansion of the Fibonacci binary number, Sum_{k&gt;0} 1/2^F(k), where F(k) = A000045(k).
 * @author Sean A. Irvine
 */
public class A084119 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A084119() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = Z.ONE.shiftLeft(-precision);
        Z sum = Z.ZERO;
        int k = 0;
        while (true) {
          final int shift = Fibonacci.fibonacci(++k).intValueExact();
          if (shift > -precision) {
            break;
          }
          sum = sum.add(one.shiftRight(shift));
        }
        return sum;
      }
    });
  }
}
