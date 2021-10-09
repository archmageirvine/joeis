package irvine.oeis.a049;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A049470 Decimal expansion of cos(1).
 * @author Sean A. Irvine
 */
public class A049470 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A049470() {
    super(CR.ONE.cos());
  }
}
