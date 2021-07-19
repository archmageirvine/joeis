package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011022 Decimal expansion of 4th root of 27.
 * @author Sean A. Irvine
 */
public class A011022 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011022() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(27), CR.FOUR.inverse()));
  }
}
