package irvine.oeis.a003;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A003077 Decimal expansion of 22/7 - Pi.
 * @author Sean A. Irvine
 */
public class A003077 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A003077() {
    super(CR.valueOf(22).divide(CR.SEVEN).subtract(CR.PI));
  }
}
