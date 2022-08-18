package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004585 Expansion of sqrt(10) in base 2.
 * @author Sean A. Irvine
 */
public class A004585 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004585() {
    super(2, CR.TEN.sqrt(), 2);
  }
}
