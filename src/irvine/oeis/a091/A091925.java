package irvine.oeis.a091;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A091925 Decimal expansion of Pi^3.
 * @author Sean A. Irvine
 */
public class A091925 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A091925() {
    super(CR.PI.multiply(CR.PI).multiply(CR.PI));
  }
}
