package irvine.oeis.a055;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A055060 Decimal expansion of Komornik-Loreti constant.
 * @author Sean A. Irvine
 */
public class A055060 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A055060() {
    super(1, new UnaryCRFunction() {
      @Override
      public CR execute(final CR x) {
        return new CR() {
          @Override
          protected Z approximate(final int precision) {
            final Z one = scale(Z.ONE, -precision);
            final Z num = scale(one, -precision);
            final Z zx = x.getApprox(precision);
            Z sum = one.negate();
            int k = 0;
            Z zxk = one;
            while (true) {
              zxk = scale(zxk.multiply(zx), precision);
              if ((Integer.bitCount(++k) & 1) == 1) { // A010060 parity of popcount
                final Z t = num.divide(zxk);
                if (t.isZero()) {
                  break;
                }
                sum = sum.add(t);
              }
            }
            return sum;
          }
        };
      }
    }.inverseMonotone(CR.valueOf("1.7"), CR.valueOf("1.8")).execute(CR.ZERO));
  }
}

