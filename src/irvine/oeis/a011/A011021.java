package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011021 Decimal expansion of 4th root of 26.
 * @author Sean A. Irvine
 */
public class A011021 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011021() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(26), CR.FOUR.inverse()));
  }
}
