package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A140247 Decimal expansion of 8/sqrt(15).
 * @author Sean A. Irvine
 */
public class A140247 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A140247() {
    super(CR.EIGHT.divide(CR.valueOf(15).sqrt()));
  }
}
