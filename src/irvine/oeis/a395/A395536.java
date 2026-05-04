package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395536 Decimal expansion of the sum of the reciprocals of pentagonal polygorials A084939.
 * @author Sean A. Irvine
 */
public class A395536 extends DecimalExpansionSequence {

  private static final CR C = CR.SIX.pow(Q.ONE_THIRD);

  /** Construct the sequence. */
  public A395536() {
    super(1, CrFunctions.AIRY_BI.cr(C).add(CrFunctions.AIRY_AI.cr(C).multiply(CR.THREE.sqrt())).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CR.THREE.pow(new Q(1, 6)).divide(2)));
  }
}

