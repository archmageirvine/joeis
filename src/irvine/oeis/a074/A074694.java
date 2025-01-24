package irvine.oeis.a074;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A074694.
 * @author Sean A. Irvine
 */
public class A074694 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A074694() {
    super(1, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return new CR() {
          @Override
          protected Z approximate(final int precision) {
            final Z one = CR.ONE.getApprox(precision);
            Z sum = Z.ZERO;
            long k = 0;
            while (true) {
              final CR t = CR.valueOf(Functions.FIBONACCI.z(++k + 1)).divide(Functions.FIBONACCI.z(k)).pow(x);
              final Z a = t.getApprox(precision);
              final Z end = a.divide(k);
              //System.out.println(k + " " + t + " " + a + " " + one + " " + a.divide(k));
              sum = sum.add(a);
              // todo fix this magic constant!
              if (k > 500 && end.compareTo(one) <= 0) {
                break;
              }
            }
            return sum.divide(k);
          }
        }.subtract(CR.PHI.pow(x));
      }
    }.inverseMonotone(CR.THREE, CR.FOUR).execute(CR.ZERO));
  }
}
