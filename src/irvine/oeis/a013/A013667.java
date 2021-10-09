package irvine.oeis.a013;

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A013667 Decimal expansion of zeta(9).
 * @author Sean A. Irvine
 */
public class A013667 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A013667() {
    super(Zeta.zeta(9));
  }
}
