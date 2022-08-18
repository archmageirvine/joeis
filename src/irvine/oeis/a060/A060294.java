package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A060294 Decimal expansion of Buffon's constant 2/Pi.
 * @author Sean A. Irvine
 */
public class A060294 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A060294() {
    super(0, CR.TWO.divide(CR.PI));
  }
}
