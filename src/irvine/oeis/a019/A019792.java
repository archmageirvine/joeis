package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019792 Decimal expansion of <code>sqrt(e)/19</code>.
 * @author Sean A. Irvine
 */
public class A019792 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.valueOf(19));

  /** Construct the sequence. */
  public A019792() {
    super(false);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
