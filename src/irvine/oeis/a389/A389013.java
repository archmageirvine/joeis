package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389013 Decimal expansion of ((-4+3 * sqrt(2))^(1/8) * exp(Pi / 4)) / 2^(3/4).
 * @author Sean A. Irvine
 */
public class A389013 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389013() {
    super(1, CR.PI.divide(4).exp().multiply(CR.TWO.pow(new Q(3, 16))).divide(CR.SQRT2.multiply(CR.TWO.subtract(CR.SQRT2).sqrt()).sqrt()).divide(CR.SQRT2.multiply(CR.TWO.add(CR.SQRT2).sqrt()).sqrt()).divide(CR.TWO.add(CR.SQRT2).pow(Q.ONE_QUARTER)));
  }
}
