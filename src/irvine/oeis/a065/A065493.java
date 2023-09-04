package irvine.oeis.a065;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A065493 Decimal expansion of the Feller-Tornier constant (1 + A065474)/2.
 * @author Sean A. Irvine
 */
public class A065493 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A065493() {
    super(0, new A065474().getCR().add(CR.ONE).divide(CR.TWO));
  }
}
