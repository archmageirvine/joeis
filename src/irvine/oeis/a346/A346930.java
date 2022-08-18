package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346930 Decimal expansion of 5207 * Pi^8 / 49601160.
 * @author Sean A. Irvine
 */
public class A346930 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346930() {
    super(0, CR.PI.pow(8).multiply(5207).divide(CR.valueOf(49601160)));
  }
}

