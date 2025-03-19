package irvine.oeis.a381;

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A381651 Decimal expansion of the multiple zeta value (Euler sum) zetamult(4,1).
 * @author Sean A. Irvine
 */
public class A381655 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A381655() {
    super(0, Zeta.zeta(6).multiply(3).divide(4).subtract(Zeta.zeta(3).square().divide(2)));
  }
}
