package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016686 Decimal expansion of log(63).
 * @author Sean A. Irvine
 */
public class A016686 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016686() {
    super(CR.valueOf(63).log());
  }
}
