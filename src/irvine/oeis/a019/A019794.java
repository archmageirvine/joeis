package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019794 Decimal expansion of sqrt(e)/21.
 * @author Sean A. Irvine
 */
public class A019794 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.valueOf(21));

  /** Construct the sequence. */
  public A019794() {
    super(false);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
