package irvine.oeis.a222;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A222071 Decimal expansion of (1/105)*Pi^3.
 * @author Sean A. Irvine
 */
public class A222071 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A222071() {
    super(CR.PI.multiply(CR.PI).multiply(CR.PI).divide(CR.valueOf(105)));
  }
}
