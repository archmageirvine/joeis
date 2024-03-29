package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011104 Decimal expansion of 5th root of 19.
 * @author Sean A. Irvine
 */
public class A011104 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011104() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(19), CR.FIVE.inverse()));
  }
}
