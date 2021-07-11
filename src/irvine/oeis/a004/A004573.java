package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004573 Expansion of sqrt(7) in base 6.
 * @author Sean A. Irvine
 */
public class A004573 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004573() {
    super(0, CR.SEVEN.sqrt(), 6);
  }
}
