package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011088 Decimal expansion of 4th root of 97.
 * @author Sean A. Irvine
 */
public class A011088 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011088() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(97), CR.FOUR.inverse()));
  }
}
