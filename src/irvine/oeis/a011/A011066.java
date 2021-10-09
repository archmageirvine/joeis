package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011066 Decimal expansion of 4th root of 74.
 * @author Sean A. Irvine
 */
public class A011066 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011066() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(74), CR.FOUR.inverse()));
  }
}
