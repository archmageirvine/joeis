package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011083 Decimal expansion of 4th root of 92.
 * @author Sean A. Irvine
 */
public class A011083 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011083() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(92), CR.FOUR.inverse()));
  }
}
