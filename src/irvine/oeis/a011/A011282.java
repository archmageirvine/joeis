package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011282 Decimal expansion of 13th root of 10.
 * @author Sean A. Irvine
 */
public class A011282 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011282() {
    super(ComputableReals.SINGLETON.pow(CR.TEN, CR.valueOf(13).inverse()));
  }
}
