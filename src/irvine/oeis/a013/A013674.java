package irvine.oeis.a013;

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A013674 Decimal expansion of zeta(16).
 * @author Sean A. Irvine
 */
public class A013674 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A013674() {
    super(Zeta.zeta(16));
  }
}
