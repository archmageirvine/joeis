package irvine.oeis.a258;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A258816 Decimal expansion of the Dirichlet beta function of 9.
 * @author Sean A. Irvine
 */
public class A258816 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A258816() {
    super(CR.PI.pow(9).multiply(new Q(277, 8257536)));
  }
}

