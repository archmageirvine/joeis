package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004587 Expansion of sqrt(10) in base 4.
 * @author Sean A. Irvine
 */
public class A004587 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004587() {
    super(0, CR.TEN.sqrt(), 4);
  }
}
