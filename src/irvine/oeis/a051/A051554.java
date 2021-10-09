package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A051554 Decimal expansion of cos(Pi degrees). (Of course, cos(Pi radians) = -1.).
 * @author Sean A. Irvine
 */
public class A051554 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A051554() {
    super(0, CR.PI.multiply(CR.PI).divide(CR.valueOf(180)).cos());
  }
}
