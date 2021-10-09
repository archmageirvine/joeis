package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016696 Decimal expansion of log(73).
 * @author Sean A. Irvine
 */
public class A016696 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016696() {
    super(CR.valueOf(73).log());
  }
}
