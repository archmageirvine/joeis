package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011404 Decimal expansion of 15th root of 18.
 * @author Sean A. Irvine
 */
public class A011404 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011404() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(18), CR.valueOf(15).inverse()));
  }
}
