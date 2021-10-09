package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011005 Decimal expansion of 4th root of 7.
 * @author Sean A. Irvine
 */
public class A011005 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011005() {
    super(ComputableReals.SINGLETON.pow(CR.SEVEN, CR.FOUR.inverse()));
  }
}
