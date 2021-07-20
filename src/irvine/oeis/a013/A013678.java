package irvine.oeis.a013;

import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013678 Decimal expansion of zeta(20).
 * @author Sean A. Irvine
 */
public class A013678 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A013678() {
    super(Zeta.zeta(20));
  }
}
