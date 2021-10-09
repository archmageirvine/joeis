package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011384 Decimal expansion of 10th root of 17.
 * @author Sean A. Irvine
 */
public class A011384 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011384() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.TEN.inverse()));
  }
}
