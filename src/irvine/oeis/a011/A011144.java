package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011144 Decimal expansion of 5th root of 59.
 * @author Sean A. Irvine
 */
public class A011144 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011144() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(59), CR.FIVE.inverse()));
  }
}
