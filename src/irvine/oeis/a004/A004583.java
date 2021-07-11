package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004583 Expansion of sqrt(8) in base 3.
 * @author Sean A. Irvine
 */
public class A004583 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004583() {
    super(0, CR.EIGHT.sqrt(), 8);
  }
}
