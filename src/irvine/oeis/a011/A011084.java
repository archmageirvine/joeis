package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011084 Decimal expansion of 4th root of 93.
 * @author Sean A. Irvine
 */
public class A011084 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011084() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(93), CR.FOUR.inverse()));
  }
}
