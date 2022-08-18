package irvine.oeis.a222;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A222072 Decimal expansion of (1/384)*Pi^4.
 * @author Sean A. Irvine
 */
public class A222072 extends DecimalExpansionSequence {

  private static final CR PI_SQUARED = CR.PI.multiply(CR.PI);

  /** Construct the sequence. */
  public A222072() {
    super(0, PI_SQUARED.multiply(PI_SQUARED).divide(CR.valueOf(384)));
  }
}
