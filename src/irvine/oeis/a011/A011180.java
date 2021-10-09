package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011180 Decimal expansion of 5th root of 95.
 * @author Sean A. Irvine
 */
public class A011180 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011180() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(95), CR.FIVE.inverse()));
  }
}
