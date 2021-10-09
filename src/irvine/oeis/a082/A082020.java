package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A082020 Decimal expansion of 15/Pi^2.
 * @author Sean A. Irvine
 */
public class A082020 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A082020() {
    super(CR.valueOf(15).divide(CR.PI.multiply(CR.PI)));
  }
}
