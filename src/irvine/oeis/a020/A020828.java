package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020828 Decimal expansion of 1/sqrt(71).
 * @author Sean A. Irvine
 */
public class A020828 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020828() {
    super(CR.valueOf(71).sqrt().inverse());
  }
}
