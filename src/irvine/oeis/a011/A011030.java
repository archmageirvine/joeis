package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011030 Decimal expansion of 4th root of 35.
 * @author Sean A. Irvine
 */
public class A011030 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011030() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(35), CR.FOUR.inverse()));
  }
}
