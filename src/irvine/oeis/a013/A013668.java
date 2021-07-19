package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013668 Decimal expansion of zeta(10).
 * @author Sean A. Irvine
 */
public class A013668 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A013668() {
    super(Zeta.zeta(10));
  }
}
