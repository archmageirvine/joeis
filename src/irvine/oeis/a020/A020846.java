package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020846 Decimal expansion of 1/sqrt(89).
 * @author Sean A. Irvine
 */
public class A020846 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020846() {
    super(CR.valueOf(89).sqrt().inverse());
  }
}
