package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004592 Expansion of sqrt(10) in base 9.
 * @author Sean A. Irvine
 */
public class A004592 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004592() {
    super(1, CR.TEN.sqrt(), 9);
  }
}
