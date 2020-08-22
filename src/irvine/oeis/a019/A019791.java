package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019791 Decimal expansion of sqrt(e)/18.
 * @author Sean A. Irvine
 */
public class A019791 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.valueOf(18));

  /** Construct the sequence. */
  public A019791() {
    super(false);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
