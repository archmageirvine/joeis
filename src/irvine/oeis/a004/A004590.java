package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004590 Expansion of sqrt(10) in base 7.
 * @author Sean A. Irvine
 */
public class A004590 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004590() {
    super(0, CR.TEN.sqrt(), 7);
  }
}
