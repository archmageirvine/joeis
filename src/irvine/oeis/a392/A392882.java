package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392882 Decimal expansion of e/(Pi*(Pi+e)).
 * @author Sean A. Irvine
 */
public class A392882 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392882() {
    super(1, CR.E.divide(CR.PI.multiply(CR.PI.add(CR.E))));
  }
}
