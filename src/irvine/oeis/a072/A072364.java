package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;
import irvine.math.cr.ComputableReals;

/**
 * A072364 Decimal expansion of <code>(1/e)^(1/e)</code>.
 * @author Sean A. Irvine
 */
public class A072364 extends DecimalExpansionSequence {

  private static final CR INV_E = CR.E.inverse();
  private static final CR N = ComputableReals.SINGLETON.pow(INV_E, INV_E);

  /** Construct the sequence. */
  public A072364() {
    super(false);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
