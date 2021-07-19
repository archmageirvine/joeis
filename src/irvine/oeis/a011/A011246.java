package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011246 Decimal expansion of 7th root of 8.
 * @author Sean A. Irvine
 */
public class A011246 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011246() {
    super(ComputableReals.SINGLETON.pow(CR.EIGHT, CR.SEVEN.inverse()));
  }
}
