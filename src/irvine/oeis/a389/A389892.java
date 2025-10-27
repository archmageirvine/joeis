package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389892 Decimal expansion of Pi^2/3 - gamma/2, where gamma is the Euler-Mascheroni constant.
 * @author Sean A. Irvine
 */
public class A389892 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389892() {
    super(1, CR.PI.square().divide(3).subtract(CR.GAMMA.divide(2)));
  }
}

