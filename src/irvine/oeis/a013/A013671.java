package irvine.oeis.a013;

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A013671 Decimal expansion of zeta(13).
 * @author Sean A. Irvine
 */
public class A013671 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A013671() {
    super(Zeta.zeta(13));
  }
}
