package irvine.oeis.a183;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A183700 Decimal expansion of zeta(3)*zeta(4), the product of two Riemann zeta values.
 * Formula: zeta(3)*zeta(4)
 * @author Georg Fischer
 */
public class A183700 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A183700() {
    super(1, Zeta.zeta(3).multiply(Zeta.zeta(4)));
  }
}
