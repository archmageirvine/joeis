package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004561 Expansion of sqrt(5) in base 8.
 * @author Sean A. Irvine
 */
public class A004561 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004561() {
    super(0, CR.FIVE.sqrt(), 8);
  }
}
