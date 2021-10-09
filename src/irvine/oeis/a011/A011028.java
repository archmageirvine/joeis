package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011028 Decimal expansion of 4th root of 33.
 * @author Sean A. Irvine
 */
public class A011028 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011028() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(33), CR.FOUR.inverse()));
  }
}
