package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346927 Decimal expansion of the Dirichlet eta function at 10.
 * @author Sean A. Irvine
 */
public class A346927 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346927() {
    super(0, CR.PI.pow(10).multiply(73).divide(CR.valueOf(6842880)));
  }
}

