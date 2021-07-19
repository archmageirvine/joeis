package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016641 Decimal expansion of log(18).
 * @author Sean A. Irvine
 */
public class A016641 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016641() {
    super(CR.valueOf(18).log());
  }
}
