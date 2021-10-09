package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011108 Decimal expansion of 5th root of 23.
 * @author Sean A. Irvine
 */
public class A011108 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011108() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(23), CR.FIVE.inverse()));
  }
}
