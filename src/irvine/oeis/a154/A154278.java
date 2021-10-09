package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154278 Decimal expansion of log_6 (13).
 * @author Sean A. Irvine
 */
public class A154278 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154278() {
    super(CR.valueOf(13).log().divide(CR.SIX.log()));
  }
}
