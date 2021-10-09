package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011247 Decimal expansion of 8th root of 8.
 * @author Sean A. Irvine
 */
public class A011247 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011247() {
    super(ComputableReals.SINGLETON.pow(CR.EIGHT, CR.EIGHT.inverse()));
  }
}
