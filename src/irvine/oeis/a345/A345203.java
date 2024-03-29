package irvine.oeis.a345;
// Generated by gen_seq4.pl decexp at 2021-07-18 19:09

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A345203 Decimal expansion of zeta(2) + 2*zeta(3).
 * Formula: zeta(2)+2*zeta(3)
 * @author Georg Fischer
 */
public class A345203 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A345203() {
    super(1, Zeta.zeta(2).add(CR.TWO.multiply(Zeta.zeta(3))));
  }
}
