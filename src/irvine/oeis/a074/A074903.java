package irvine.oeis.a074;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A074903 Decimal expansion of the mean number of iterations in comparing two numbers via their continued fractions.
 * @author Sean A. Irvine
 */
public class A074903 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A074903() {
    super(1, CR.valueOf(-60).divide(CR.PI.pow(4))
      .multiply(CrFunctions.POLYLOG.cr(4, CR.HALF).multiply(24)
        .subtract(CR.PI.square().multiply(CR.LOG2.square()))
        .add(Zeta.zeta(3).multiply(CR.LOG2).multiply(21))
        .add(CR.LOG2.pow(4)))
      .add(17));
  }
}

