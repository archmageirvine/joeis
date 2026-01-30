package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392883 allocated for Claude H. R. Dequatre.
 * @author Sean A. Irvine
 */
public class A392883 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392883() {
    super(1, CR.E.divide(CR.PI.multiply(CR.PI.subtract(CR.E))));
  }
}
