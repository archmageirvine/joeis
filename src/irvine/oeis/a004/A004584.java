package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004584 Expansion of sqrt(8) in base 3.
 * @author Sean A. Irvine
 */
public class A004584 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004584() {
    super(0, CR.EIGHT.sqrt(), 9);
  }
}
