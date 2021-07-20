package irvine.oeis.a013;

import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013672 Decimal expansion of zeta(14).
 * @author Sean A. Irvine
 */
public class A013672 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A013672() {
    super(Zeta.zeta(14));
  }
}
