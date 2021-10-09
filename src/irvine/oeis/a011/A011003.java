package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011003 Decimal expansion of 4th root of 5.
 * @author Sean A. Irvine
 */
public class A011003 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011003() {
    super(ComputableReals.SINGLETON.pow(CR.FIVE, CR.FOUR.inverse()));
  }
}
