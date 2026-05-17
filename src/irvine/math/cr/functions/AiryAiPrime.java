package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;

/**
 * The Airy Ai derivative function.
 * @author Sean A. Irvine
 */
class AiryAiPrime extends CrFunction1 {

  private static final CR[] FIVE_THIRDS = {CR.valueOf(new Q(5, 3))};
  private static final CR[] ONE_THIRD = {CR.valueOf(Q.ONE_THIRD)};
  private static final CR C1 = CR.ONE_THIRD.pow(new Q(2, 3));
  private static final CR C2 = C1.divide(CrFunctions.GAMMA.cr(new Q(2, 3)).multiply(2));
  private static final CR C3 = CR.ONE_THIRD.pow(CR.ONE_THIRD).divide(CrFunctions.GAMMA.cr(CR.ONE_THIRD));
  private static final CR[] EMPTY = new CR[0];

  @Override
  public CR cr(final CR z) {
    final CR z3 = z.pow(3).divide(9);
    return ComputableReals.SINGLETON.hypergeometric(EMPTY, FIVE_THIRDS, z3).multiply(C2).multiply(z.square())
      .subtract(ComputableReals.SINGLETON.hypergeometric(EMPTY, ONE_THIRD, z3).multiply(C3));
  }
}
