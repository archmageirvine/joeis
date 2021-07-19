package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011309 Decimal expansion of 10th root of 12.
 * @author Sean A. Irvine
 */
public class A011309 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011309() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(12), CR.TEN.inverse()));
  }
}
