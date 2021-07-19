package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016671 Decimal expansion of log(48).
 * @author Sean A. Irvine
 */
public class A016671 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016671() {
    super(CR.valueOf(48).log());
  }
}
