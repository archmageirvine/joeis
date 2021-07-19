package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011389 Decimal expansion of 15th root of 17.
 * @author Sean A. Irvine
 */
public class A011389 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011389() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.valueOf(15).inverse()));
  }
}
