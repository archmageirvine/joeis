package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004540 Expansion of sqrt(2) in base 3.
 * @author Sean A. Irvine
 */
public class A004540 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004540() {
    super(1, CR.SQRT2, 3);
  }
}
