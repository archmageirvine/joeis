package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A081760 Decimal expansion of the conjectured Landau's constant L.
 * @author Sean A. Irvine
 */
public class A081760 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A081760() {
    super(0, CR.PI.square().multiply(CR.TWO.pow(new Q(5, 3)).divide(CrFunctions.GAMMA.cr(Q.ONE_THIRD).pow(3).multiply(3))));
  }
}

