package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004574 Expansion of sqrt(7) in base 7.
 * @author Sean A. Irvine
 */
public class A004574 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004574() {
    super(0, CR.SEVEN.sqrt(), 7);
  }
}
