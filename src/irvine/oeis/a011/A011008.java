package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011008 Decimal expansion of 4th root of 11.
 * @author Sean A. Irvine
 */
public class A011008 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011008() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(11), CR.FOUR.inverse()));
  }
}
