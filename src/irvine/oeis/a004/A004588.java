package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004588 Expansion of sqrt(10) in base 5.
 * @author Sean A. Irvine
 */
public class A004588 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004588() {
    super(0, CR.TEN.sqrt(), 5);
  }
}
