package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011068 Decimal expansion of 4th root of 76.
 * @author Sean A. Irvine
 */
public class A011068 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011068() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(76), CR.FOUR.inverse()));
  }
}
