package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004570 Expansion of sqrt(7) in base 3.
 * @author Sean A. Irvine
 */
public class A004570 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004570() {
    super(0, CR.SEVEN.sqrt(), 3);
  }
}
