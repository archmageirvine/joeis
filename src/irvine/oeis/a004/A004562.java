package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004562 Expansion of sqrt(5) in base 2.
 * @author Sean A. Irvine
 */
public class A004562 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004562() {
    super(0, CR.FIVE.sqrt(), 9);
  }
}
