package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004539 Expansion of sqrt(2) in base 2.
 * @author Sean A. Irvine
 */
public class A004539 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004539() {
    super(1, CR.SQRT2, 2);
  }
}
