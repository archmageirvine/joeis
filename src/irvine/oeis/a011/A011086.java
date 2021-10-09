package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011086 Decimal expansion of 4th root of 95.
 * @author Sean A. Irvine
 */
public class A011086 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011086() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(95), CR.FOUR.inverse()));
  }
}
