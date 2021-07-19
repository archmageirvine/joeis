package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011278 Decimal expansion of 9th root of 10.
 * @author Sean A. Irvine
 */
public class A011278 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011278() {
    super(ComputableReals.SINGLETON.pow(CR.TEN, CR.NINE.inverse()));
  }
}
