package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011269 Decimal expansion of 15th root of 9.
 * @author Sean A. Irvine
 */
public class A011269 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011269() {
    super(ComputableReals.SINGLETON.pow(CR.NINE, CR.valueOf(15).inverse()));
  }
}
