package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393086 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A393086 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393086() {
    super(1, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        final CR x2 = x.square();
        final CR log = x.log();
        return CR.ONE.add(x2).subtract(log.log().multiply(log).multiply(x2).multiply(CR.TWO));
      }
    }.inverseMonotone(CR.FOUR, CR.FIVE).execute(CR.ZERO));
  }
}

