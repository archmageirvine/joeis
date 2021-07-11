package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019795 Decimal expansion of sqrt(e)/22.
 * @author Sean A. Irvine
 */
public class A019795 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019795() {
    super(-1, CR.E.sqrt().divide(CR.valueOf(22)));
  }
}
