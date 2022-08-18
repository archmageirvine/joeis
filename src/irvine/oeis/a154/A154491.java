package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154491 Decimal expansion of log_19 (14).
 * @author Sean A. Irvine
 */
public class A154491 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154491() {
    super(0, CR.valueOf(14).log().divide(CR.valueOf(19).log()));
  }
}
