package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004589 Expansion of sqrt(10) in base 6.
 * @author Sean A. Irvine
 */
public class A004589 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004589() {
    super(1, CR.TEN.sqrt(), 6);
  }
}
