package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;

/**
 * The Airy Ai function.
 * @author Sean A. Irvine
 */
class AiryBi extends CrFunction1 {

  private static final CR[] TWO_THIRDS = {CR.valueOf(new Q(2, 3))};
  private static final CR[] FOUR_THIRDS = {CR.valueOf(new Q(4, 3))};
  private static final CR C1 = CR.ONE_THIRD.pow(new Q(1, 6));
  private static final CR C2 = C1.divide(TWO_THIRDS[0].gamma());
  private static final CR C3 = CR.THREE.pow(new Q(1, 6)).divide(CR.ONE_THIRD.gamma());
  private static final CR[] EMPTY = new CR[0];

  @Override
  public CR cr(final CR z) {
    final CR z3 = z.pow(3).divide(9);
    return ComputableReals.SINGLETON.hypergeometric(EMPTY, TWO_THIRDS, z3).multiply(C2)
      .add(ComputableReals.SINGLETON.hypergeometric(EMPTY, FOUR_THIRDS, z3).multiply(z).multiply(C3));
  }
}
