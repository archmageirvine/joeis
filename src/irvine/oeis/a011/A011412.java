package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011412 Decimal expansion of 8th root of 19.
 * @author Sean A. Irvine
 */
public class A011412 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011412() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(19), CR.EIGHT.inverse()));
  }
}
