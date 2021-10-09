package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011231 Decimal expansion of 7th root of 7.
 * @author Sean A. Irvine
 */
public class A011231 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011231() {
    super(ComputableReals.SINGLETON.pow(CR.SEVEN, CR.SEVEN.inverse()));
  }
}
