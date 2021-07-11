package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004569 Expansion of sqrt(7) in base 2.
 * @author Sean A. Irvine
 */
public class A004569 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004569() {
    super(0, CR.SEVEN.sqrt(), 2);
  }
}
