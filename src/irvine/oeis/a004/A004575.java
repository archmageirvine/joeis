package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004575 Expansion of sqrt(7) in base 8.
 * @author Sean A. Irvine
 */
public class A004575 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004575() {
    super(0, CR.SEVEN.sqrt(), 8);
  }
}
