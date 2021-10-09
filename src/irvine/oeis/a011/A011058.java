package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011058 Decimal expansion of 4th root of 66.
 * @author Sean A. Irvine
 */
public class A011058 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011058() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(66), CR.FOUR.inverse()));
  }
}
