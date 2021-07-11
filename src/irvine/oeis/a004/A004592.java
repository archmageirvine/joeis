package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004592 Expansion of sqrt(10) in base 2.
 * @author Sean A. Irvine
 */
public class A004592 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004592() {
    super(0, CR.TEN.sqrt(), 9);
  }
}
