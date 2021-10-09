package irvine.oeis.a013;

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A013664 Decimal expansion of zeta(6).
 * @author Sean A. Irvine
 */
public class A013664 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A013664() {
    super(Zeta.zeta(6));
  }
}
