package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346932 Decimal expansion of 7 * Pi^4 / 729.
 * @author Sean A. Irvine
 */
public class A346932 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346932() {
    super(0, CR.PI.pow(4).multiply(CR.SEVEN).divide(CR.valueOf(729)));
  }
}

