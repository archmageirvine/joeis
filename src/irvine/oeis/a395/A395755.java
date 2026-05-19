package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395755 Decimal expansion of the sum of the reciprocals of octagonal polygorials A084941.
 * @author Sean A. Irvine
 */
public class A395755 extends DecimalExpansionSequence {

  private static final CR C1 = CR.THREE.pow(new Q(1, 3));

  /** Construct the sequence. */
  public A395755() {
    super(1, CrFunctions.AIRY_BI_PRIME.cr(C1).divide(CR.THREE.sqrt()).subtract(CrFunctions.AIRY_AI_PRIME.cr(C1)).multiply(CrFunctions.GAMMA.cr(Q.ONE_THIRD)).multiply(C1).divide(2));
  }
}

