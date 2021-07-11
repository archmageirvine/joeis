package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019792 Decimal expansion of sqrt(e)/19.
 * @author Sean A. Irvine
 */
public class A019792 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019792() {
    super(-1, CR.E.sqrt().divide(CR.valueOf(19)));
  }
}
