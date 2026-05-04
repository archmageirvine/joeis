package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395597 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A395597 extends DecimalExpansionSequence {

  private static final CR PI3 = CR.PI.divide(3);

  /** Construct the sequence. */
  public A395597() {
    super(1, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return ComputableReals.SINGLETON.atan(x).multiply(2).subtract(x.multiply(x).add(1).log().divide(x)).subtract(PI3);
      }
    }.inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO));
  }
}

