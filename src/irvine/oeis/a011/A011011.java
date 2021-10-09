package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011011 Decimal expansion of 4th root of 14.
 * @author Sean A. Irvine
 */
public class A011011 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011011() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(14), CR.FOUR.inverse()));
  }
}
