package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011075 Decimal expansion of 4th root of 84.
 * @author Sean A. Irvine
 */
public class A011075 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011075() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(84), CR.FOUR.inverse()));
  }
}
