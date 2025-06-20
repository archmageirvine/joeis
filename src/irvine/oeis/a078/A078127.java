package irvine.oeis.a078;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A078127 Decimal expansion of DirichletBeta'(1).
 * @author Sean A. Irvine
 */
public class A078127 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A078127() {
    super(0, CR.GAMMA.add(CR.LOG2.multiply(2)).add(CR.PI.log().multiply(3)).subtract(CrFunctions.GAMMA.cr(Q.ONE_QUARTER).log().multiply(4)).multiply(CR.PI).divide(4));
  }
}

