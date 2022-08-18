package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004556 Expansion of sqrt(5) in base 3.
 * @author Sean A. Irvine
 */
public class A004556 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004556() {
    super(1, CR.FIVE.sqrt(), 3);
  }
}
