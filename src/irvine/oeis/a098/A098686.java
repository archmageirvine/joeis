package irvine.oeis.a098;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A098686 Decimal expansion of Sum_{n &gt;= 1} n/(n^n).
 * @author Sean A. Irvine
 */
public class A098686 extends DecimalExpansionSequence {

  /**
   * Construct with a given addition in the denominator.
   * @param add addend in denominator
   */
  public A098686(final int add) {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        Z k = Z.NEG_ONE;
        final Z one = Z.ONE.shiftLeft(-precision);
        while (true) {
          k = k.add(1);
          final Z t = one.divide(k.add(add).pow(k));
          if (t.isZero()) {
            break;
          }
          sum = sum.add(t);
        }
        return sum;
      }
    });
  }

  /** Construct the sequence. */
  public A098686() {
    this(1);
  }
}
