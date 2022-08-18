package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346931 Decimal expansion of 403 * Pi^6 / 393660.
 * @author Sean A. Irvine
 */
public class A346931 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346931() {
    super(0, CR.PI.pow(6).multiply(403).divide(CR.valueOf(393660)));
  }
}

