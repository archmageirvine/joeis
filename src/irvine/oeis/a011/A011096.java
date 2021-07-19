package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011096 Decimal expansion of 5th root of 11.
 * @author Sean A. Irvine
 */
public class A011096 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011096() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(11), CR.FIVE.inverse()));
  }
}
