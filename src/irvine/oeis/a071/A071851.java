package irvine.oeis.a071;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A071851 The limit of a continued fraction.
 * @author Sean A. Irvine
 */
public class A071851 extends DecimalExpansionSequence {

  private static final int EXTRA_PRECISION = 5;
  private static int sCachedSteps = 0;
  private static CR sU = CR.ONE;
  private static CR sA = CR.ZERO;
  private static CR sB = CR.ONE;
  private static CR sC = CR.ONE;
  private static CR sD = CR.ZERO;

  private static CR build(final int steps) {
    while (steps > sCachedSteps) {
      ++sCachedSteps;
      final CR nb = sB.multiply(sU).add(sA);
      sA = sB;
      sB = nb;
      final CR nd = sD.multiply(sU).add(sC);
      sC = sD;
      sD = nd;
      // Make final versions for anonymous function
      final CR fa = sA;
      final CR fb = sB;
      final CR fc = sC;
      final CR fd = sD;
      sU = new UnaryCrFunction() {
        @Override
        public CR execute(final CR x) {
          return x.multiply(fb).add(fa).divide(x.multiply(fd).add(fc)).subtract(x);
        }
      }.inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO);
    }
    return sU;
  }

  private static CR build() {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int workingPrecision = precision - EXTRA_PRECISION;
        Z a = build(sCachedSteps).getApprox(workingPrecision);
        while (true) {
          final Z b = build(sCachedSteps + 1).getApprox(workingPrecision);
          if (a.equals(b)) {
            return scale(a, -EXTRA_PRECISION);
          }
          a = b;
        }
      }
    };
  }

  /** Construct the sequence. */
  public A071851() {
    super(1, build());
  }
}
