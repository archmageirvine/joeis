package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004557 Expansion of sqrt(5) in base 4.
 * @author Sean A. Irvine
 */
public class A004557 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004557() {
    super(0, CR.FIVE.sqrt(), 4);
  }
}
