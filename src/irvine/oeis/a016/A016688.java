package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016688 Decimal expansion of log(65).
 * @author Sean A. Irvine
 */
public class A016688 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016688() {
    super(CR.valueOf(65).log());
  }
}
