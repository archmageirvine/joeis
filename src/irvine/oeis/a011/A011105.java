package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011105 Decimal expansion of 5th root of 20.
 * @author Sean A. Irvine
 */
public class A011105 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011105() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(20), CR.FIVE.inverse()));
  }
}
