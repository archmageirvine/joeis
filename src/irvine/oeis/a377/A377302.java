package irvine.oeis.a377;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A377302 Decimal expansion of the smallest positive real solution to Gamma(1+z) = Gamma(1-z).
 * @author Sean A. Irvine
 */
public class A377302 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A377302() {
    super(1, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return CR.PI.multiply(x).sin().multiply(x).multiply(CrFunctions.GAMMA.cr(x).square()).subtract(CR.PI);
      }
    }.inverseMonotone(CR.TWO, CR.valueOf(2.5)).execute(CR.ZERO));
  }
}

