package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011233 Decimal expansion of 9th root of 7.
 * @author Sean A. Irvine
 */
public class A011233 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011233() {
    super(ComputableReals.SINGLETON.pow(CR.SEVEN, CR.NINE.inverse()));
  }
}
