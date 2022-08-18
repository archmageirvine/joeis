package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004544 Expansion of sqrt(2) in base 7.
 * @author Sean A. Irvine
 */
public class A004544 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004544() {
    super(1, CR.SQRT2, 7);
  }
}
