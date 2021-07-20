package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A002162 Decimal expansion of the natural logarithm of 2.
 * @author Sean A. Irvine
 */
public class A002162 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A002162() {
    super(CR.TWO.log());
  }
}
