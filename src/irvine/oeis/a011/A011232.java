package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011232 Decimal expansion of 8th root of 7.
 * @author Sean A. Irvine
 */
public class A011232 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011232() {
    super(ComputableReals.SINGLETON.pow(CR.SEVEN, CR.EIGHT.inverse()));
  }
}
