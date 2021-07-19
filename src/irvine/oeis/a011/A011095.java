package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011095 Decimal expansion of 5th root of 10.
 * @author Sean A. Irvine
 */
public class A011095 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011095() {
    super(ComputableReals.SINGLETON.pow(CR.TEN, CR.FIVE.inverse()));
  }
}
