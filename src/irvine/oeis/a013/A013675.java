package irvine.oeis.a013;

import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013675 Decimal expansion of zeta(17).
 * @author Sean A. Irvine
 */
public class A013675 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A013675() {
    super(Zeta.zeta(17));
  }
}
