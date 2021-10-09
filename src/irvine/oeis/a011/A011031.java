package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011031 Decimal expansion of 4th root of 37.
 * @author Sean A. Irvine
 */
public class A011031 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011031() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(37), CR.FOUR.inverse()));
  }
}
