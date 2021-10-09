package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004580 Expansion of sqrt(8) in base 5.
 * @author Sean A. Irvine
 */
public class A004580 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004580() {
    super(0, CR.EIGHT.sqrt(), 5);
  }
}
