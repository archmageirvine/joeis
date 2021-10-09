package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011089 Decimal expansion of 4th root of 98.
 * @author Sean A. Irvine
 */
public class A011089 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011089() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(98), CR.FOUR.inverse()));
  }
}
