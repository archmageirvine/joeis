package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154163 Decimal expansion of log_13 (10).
 * @author Sean A. Irvine
 */
public class A154163 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154163() {
    super(0, CR.LOG10.divide(CR.valueOf(13).log()));
  }
}
