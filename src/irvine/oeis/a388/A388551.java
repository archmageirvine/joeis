package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388551 Decimal expansion of sqrt((2 * (2+sqrt(5))) / 5) * exp(-Pi/12).
 * @author Sean A. Irvine
 */
public class A388551 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388551() {
    super(1, CR.PI.divide(-12).exp().multiply(new Q(16, 125)).multiply(CR.TWO.pow(new Q(1, 10))).multiply(CR.FIVE.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(9, 10)).pow(3)).multiply(CrFunctions.GAMMA.cr(new Q(7, 10)).pow(3)).multiply(CR.FIVE.add(CR.FIVE.sqrt()).pow(3)).multiply(CR.FIVE.sqrt().subtract(1).divide(4).pow(3)).multiply(CR.FIVE.sqrt().add(1).divide(4).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(4, 5)).pow(6)));
  }
}
