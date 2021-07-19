package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013666 Decimal expansion of zeta(8).
 * @author Sean A. Irvine
 */
public class A013666 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A013666() {
    super(Zeta.zeta(8));
  }
}
