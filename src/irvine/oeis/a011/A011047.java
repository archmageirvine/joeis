package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011047 Decimal expansion of 4th root of 54.
 * @author Sean A. Irvine
 */
public class A011047 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011047() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(54), CR.FOUR.inverse()));
  }
}
