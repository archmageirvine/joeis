package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346929 Decimal expansion of 73 * Pi^10 / 4591650240.
 * @author Sean A. Irvine
 */
public class A346929 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346929() {
    super(CR.PI.pow(10).multiply(48983).divide(CR.valueOf(4591650240L)));
  }
}

