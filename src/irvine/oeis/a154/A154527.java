package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154527 Decimal expansion of log_23 (14).
 * @author Sean A. Irvine
 */
public class A154527 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154527() {
    super(CR.valueOf(14).log().divide(CR.valueOf(23).log()));
  }
}
