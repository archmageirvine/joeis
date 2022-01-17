package irvine.oeis.a175;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A175571 Decimal expansion of the Dirichlet beta function of 5.
 * Formula: 5*Pi^5/1536
 * @author Georg Fischer
 */
public class A175571 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A175571() {
    super(0, CR.FIVE.multiply(CR.PI.pow(CR.FIVE)).divide(CR.valueOf(1536)));
  }
}
