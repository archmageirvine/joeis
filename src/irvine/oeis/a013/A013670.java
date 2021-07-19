package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013670 Decimal expansion of zeta(12).
 * @author Sean A. Irvine
 */
public class A013670 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A013670() {
    super(Zeta.zeta(12));
  }
}
