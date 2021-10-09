package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154976 Decimal expansion of log_20 (18).
 * @author Sean A. Irvine
 */
public class A154976 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154976() {
    super(CR.valueOf(18).log().divide(CR.valueOf(20).log()));
  }
}
