package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011188 Decimal expansion of 9th root of 4.
 * @author Sean A. Irvine
 */
public class A011188 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011188() {
    super(ComputableReals.SINGLETON.pow(CR.FOUR, CR.NINE.inverse()));
  }
}
