package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016701 Decimal expansion of log(78).
 * @author Sean A. Irvine
 */
public class A016701 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016701() {
    super(CR.valueOf(78).log());
  }
}
