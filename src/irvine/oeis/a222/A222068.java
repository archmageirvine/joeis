package irvine.oeis.a222;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A222068 Decimal expansion of <code>(1/16)*Pi^2</code>.
 * @author Sean A. Irvine
 */
public class A222068 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.multiply(CR.PI).divide(CR.valueOf(16));

  /** Construct the sequence. */
  public A222068() {
    super(false);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
