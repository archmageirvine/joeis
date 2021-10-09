package irvine.oeis.a347;

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A347330 Decimal expansion of zeta(10) / zeta(5).
 * @author Sean A. Irvine
 */
public class A347330 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347330() {
    super(Zeta.zeta(10).divide(Zeta.zeta(5)));
  }
}
