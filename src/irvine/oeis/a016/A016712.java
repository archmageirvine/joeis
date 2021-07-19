package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016712 Decimal expansion of log(89).
 * @author Sean A. Irvine
 */
public class A016712 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016712() {
    super(CR.valueOf(89).log());
  }
}
