package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011289 Decimal expansion of 20th root of 10.
 * @author Sean A. Irvine
 */
public class A011289 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011289() {
    super(ComputableReals.SINGLETON.pow(CR.TEN, CR.valueOf(20).inverse()));
  }
}
