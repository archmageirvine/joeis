package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004582 Expansion of sqrt(8) in base 7.
 * @author Sean A. Irvine
 */
public class A004582 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004582() {
    super(0, CR.EIGHT.sqrt(), 7);
  }
}
