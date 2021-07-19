package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020775 Decimal expansion of 1/sqrt(18).
 * @author Sean A. Irvine
 */
public class A020775 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020775() {
    super(CR.valueOf(18).sqrt().inverse());
  }
}
