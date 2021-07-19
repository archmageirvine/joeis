package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011039 Decimal expansion of 4th root of 45.
 * @author Sean A. Irvine
 */
public class A011039 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011039() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(45), CR.FOUR.inverse()));
  }
}
