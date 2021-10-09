package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A002163 Decimal expansion of square root of 5.
 * @author Sean A. Irvine
 */
public class A002163 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A002163() {
    super(CR.FIVE.sqrt());
  }
}
