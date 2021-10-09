package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011239 Decimal expansion of 15th root of 7.
 * @author Sean A. Irvine
 */
public class A011239 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011239() {
    super(ComputableReals.SINGLETON.pow(CR.SEVEN, CR.valueOf(15).inverse()));
  }
}
