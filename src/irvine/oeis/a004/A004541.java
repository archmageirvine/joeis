package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004541 Expansion of sqrt(2) in base 4.
 * @author Sean A. Irvine
 */
public class A004541 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004541() {
    super(1, CR.SQRT2, 4);
  }
}
