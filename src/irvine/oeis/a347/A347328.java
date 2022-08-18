package irvine.oeis.a347;

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A347328 Decimal expansion of zeta(6) / zeta(3).
 * @author Sean A. Irvine
 */
public class A347328 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347328() {
    super(0, Zeta.zeta(6).divide(Zeta.zeta(3)));
  }
}
