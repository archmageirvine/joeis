package irvine.oeis.a013;

import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013662 Decimal expansion of zeta(4).
 * @author Sean A. Irvine
 */
public class A013662 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A013662() {
    super(Zeta.zeta(4));
  }
}
