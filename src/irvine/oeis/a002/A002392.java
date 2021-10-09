package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A002392 Decimal expansion of natural logarithm of 10.
 * @author Sean A. Irvine
 */
public class A002392 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A002392() {
    super(CR.TEN.log());
  }
}
