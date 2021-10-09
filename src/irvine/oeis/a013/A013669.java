package irvine.oeis.a013;

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A013669 Decimal expansion of zeta(11).
 * @author Sean A. Irvine
 */
public class A013669 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A013669() {
    super(Zeta.zeta(11));
  }
}
