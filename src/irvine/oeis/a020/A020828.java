package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020828 Decimal expansion of 1/sqrt(71).
 * @author Sean A. Irvine
 */
public class A020828 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020828() {
    super(0, CR.valueOf(71).sqrt().inverse());
  }
}
