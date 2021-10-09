package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011127 Decimal expansion of 5th root of 42.
 * @author Sean A. Irvine
 */
public class A011127 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011127() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(42), CR.FIVE.inverse()));
  }
}
