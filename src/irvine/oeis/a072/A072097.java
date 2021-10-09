package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A072097 Decimal expansion of 180/Pi.
 * @author Sean A. Irvine
 */
public class A072097 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A072097() {
    super(CR.valueOf(180).divide(CR.PI));
  }
}
