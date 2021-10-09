package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011029 Decimal expansion of 4th root of 34.
 * @author Sean A. Irvine
 */
public class A011029 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011029() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(34), CR.FOUR.inverse()));
  }
}
