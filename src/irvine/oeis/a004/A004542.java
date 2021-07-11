package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004542 Expansion of sqrt(2) in base 5.
 * @author Sean A. Irvine
 */
public class A004542 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004542() {
    super(0, CR.SQRT2, 5);
  }
}
