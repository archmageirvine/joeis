package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020849 Decimal expansion of 1/sqrt(92).
 * @author Sean A. Irvine
 */
public class A020849 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020849() {
    super(CR.valueOf(92).sqrt().inverse());
  }
}
