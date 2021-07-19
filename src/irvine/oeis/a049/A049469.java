package irvine.oeis.a049;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A049469 Decimal expansion of sin(1).
 * @author Sean A. Irvine
 */
public class A049469 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A049469() {
    super(CR.ONE.sin());
  }
}
