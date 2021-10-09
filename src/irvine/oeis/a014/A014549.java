package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A014549 Decimal expansion of 1 / M(1,sqrt(2)) (Gauss's constant).
 * @author Sean A. Irvine
 */
public class A014549 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A014549() {
    super(CR.ONE.divide(CR.ONE.agm(CR.SQRT2)));
  }
}
