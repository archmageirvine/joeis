package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019797 Decimal expansion of sqrt(e)/24.
 * @author Sean A. Irvine
 */
public class A019797 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.valueOf(24));

  /** Construct the sequence. */
  public A019797() {
    super(false);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
