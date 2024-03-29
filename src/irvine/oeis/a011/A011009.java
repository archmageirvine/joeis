package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011009 Decimal expansion of 4th root of 12.
 * @author Sean A. Irvine
 */
public class A011009 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011009() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(12), CR.FOUR.inverse()));
  }
}
