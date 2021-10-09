package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004591 Expansion of sqrt(10) in base 8.
 * @author Sean A. Irvine
 */
public class A004591 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004591() {
    super(0, CR.TEN.sqrt(), 8);
  }
}
