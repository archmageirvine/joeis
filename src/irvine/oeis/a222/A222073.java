package irvine.oeis.a222;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A222073 Decimal expansion of (32/25515)*Pi^4.
 * @author Sean A. Irvine
 */
public class A222073 extends DecimalExpansionSequence {

  private static final CR PI_SQUARED = CR.PI.multiply(CR.PI);

  /** Construct the sequence. */
  public A222073() {
    super(PI_SQUARED.multiply(PI_SQUARED).shiftLeft(5).divide(CR.valueOf(25515)));
  }
}
