package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011062 Decimal expansion of 4th root of 70.
 * @author Sean A. Irvine
 */
public class A011062 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011062() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(70), CR.FOUR.inverse()));
  }
}
