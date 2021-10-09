package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019810 Decimal expansion of sine of 1 degree.
 * @author Sean A. Irvine
 */
public class A019810 extends DecimalExpansionSequence {

  protected A019810(final long angle) {
    super(CR.PI.multiply(angle).divide(CR.valueOf(180)).sin());
  }

  /** Construct the sequence. */
  public A019810() {
    this(1);
  }
}
