package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395597 Decimal expansion of the aspect ratio of a rectangle with the property that a straight line drawn through a uniformly random point on one of the two larger sides, with direction chosen uniformly at random, intersects each of the three other sides with an equal probability.
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

