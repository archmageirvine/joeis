package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011397 Decimal expansion of 8th root of 18.
 * @author Sean A. Irvine
 */
public class A011397 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011397() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(18), CR.EIGHT.inverse()));
  }
}
