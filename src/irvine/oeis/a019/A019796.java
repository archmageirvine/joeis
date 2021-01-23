package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019796 Decimal expansion of sqrt(e)/23.
 * @author Sean A. Irvine
 */
public class A019796 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.valueOf(23));

  /** Construct the sequence. */
  public A019796() {
    super(false);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
