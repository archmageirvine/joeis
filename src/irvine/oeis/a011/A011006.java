package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011006 Decimal expansion of 4th root of 8.
 * @author Sean A. Irvine
 */
public class A011006 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011006() {
    super(ComputableReals.SINGLETON.pow(CR.EIGHT, CR.FOUR.inverse()));
  }
}
