package irvine.oeis.a092;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A092425 Decimal expansion of Pi^4.
 * @author Sean A. Irvine
 */
public class A092425 extends DecimalExpansionSequence {

  private static final CR PI_SQUARED = CR.PI.multiply(CR.PI);

  /** Construct the sequence. */
  public A092425() {
    super(PI_SQUARED.multiply(PI_SQUARED));
  }
}
