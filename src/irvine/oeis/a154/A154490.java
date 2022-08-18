package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154490 Decimal expansion of log_18 (14).
 * @author Sean A. Irvine
 */
public class A154490 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154490() {
    super(0, CR.valueOf(14).log().divide(CR.valueOf(18).log()));
  }
}
