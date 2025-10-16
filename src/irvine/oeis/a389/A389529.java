package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.oeis.a006.A006752;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389529 Decimal expansion of Sum_{n&gt;=0} 1/((2*n + 1)*(4*n + 1)*(4*n + 3)^2).
 * @author Sean A. Irvine
 */
public class A389529 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389529() {
    super(0, CR.PI.square().divide(16).add(CR.LOG2.divide(2)).subtract(new A006752().getCR().divide(2)).subtract(CR.PI.divide(8)));
  }
}

