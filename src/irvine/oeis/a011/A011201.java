package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011201 Decimal expansion of 7th root of 5.
 * @author Sean A. Irvine
 */
public class A011201 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011201() {
    super(ComputableReals.SINGLETON.pow(CR.FIVE, CR.SEVEN.inverse()));
  }
}
