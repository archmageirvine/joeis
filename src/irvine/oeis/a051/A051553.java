package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A051553 Decimal expansion of sin (Pi degrees). (Of course sin (Pi radians) = 0.).
 * @author Sean A. Irvine
 */
public class A051553 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A051553() {
    super(0, CR.PI.multiply(CR.PI).divide(CR.valueOf(180)).sin());
  }
}
