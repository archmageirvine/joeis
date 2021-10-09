package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004555 Expansion of sqrt(5) in base 2.
 * @author Sean A. Irvine
 */
public class A004555 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004555() {
    super(0, CR.FIVE.sqrt(), 2);
  }
}
