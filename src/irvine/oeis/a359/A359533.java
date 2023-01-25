package irvine.oeis.a359;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A359533 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A359533 extends DecimalExpansionSequence {

  private static final CR ONE_EIGHTH = CR.EIGHT.inverse();
  private static final CR THREE_EIGHTH = CR.valueOf(new Q(3, 8));
  private static final CR ONE_QUARTER = CR.valueOf(Q.ONE_QUARTER);
  private static final CR THREE_QUARTER = CR.valueOf(new Q(3, 4));

  // Gamma(1/8)*Gamma(3/8)/(Gamma(1/4)*Gamma(3/4)))^2/(6*sqrt(2)*Pi) - 4*log(2)/Pi

  /** Construct the sequence. */
  public A359533() {
    super(CR.TWO.log().multiply(4).divide(CR.PI)
      .subtract(ONE_EIGHTH.gamma().multiply(THREE_EIGHTH.gamma())
        .divide(ONE_QUARTER.gamma().multiply(THREE_QUARTER.gamma())).square()
        .divide(CR.PI.multiply(CR.SQRT2).multiply(6)))
    );
  }
}
