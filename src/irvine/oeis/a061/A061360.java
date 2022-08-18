package irvine.oeis.a061;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A061360 Decimal expansion of e/Pi.
 * @author Sean A. Irvine
 */
public class A061360 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A061360() {
    super(0, CR.E.divide(CR.PI));
  }
}
