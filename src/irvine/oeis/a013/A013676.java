package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013676 Decimal expansion of zeta(18).
 * @author Sean A. Irvine
 */
public class A013676 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A013676() {
    super(Zeta.zeta(18));
  }
}
