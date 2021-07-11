package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004540 Expansion of sqrt(2) in base 3.
 * @author Sean A. Irvine
 */
public class A004540 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004540() {
    super(0, CR.SQRT2, 3);
  }
}
