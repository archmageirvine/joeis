package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011046 Decimal expansion of 4th root of 53.
 * @author Sean A. Irvine
 */
public class A011046 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011046() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(53), CR.FOUR.inverse()));
  }
}
