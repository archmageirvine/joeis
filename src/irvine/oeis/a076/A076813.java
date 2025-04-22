package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A076813 Decimal expansion of Sum_{k&gt;=1} zeta(2k)/k! = 2.40744...
 * @author Sean A. Irvine
 */
public class A076813 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A076813() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        int k = 0;
        while (true) {
          ++k;
          final Z t = Zeta.zeta(2 * k).divide(Functions.FACTORIAL.z(k)).getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}

