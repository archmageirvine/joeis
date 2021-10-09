package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011040 Decimal expansion of 4th root of 46.
 * @author Sean A. Irvine
 */
public class A011040 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011040() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(46), CR.FOUR.inverse()));
  }
}
