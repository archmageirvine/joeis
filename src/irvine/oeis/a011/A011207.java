package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011207 Decimal expansion of 13th root of 5.
 * @author Sean A. Irvine
 */
public class A011207 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011207() {
    super(ComputableReals.SINGLETON.pow(CR.FIVE, CR.valueOf(13).inverse()));
  }
}
