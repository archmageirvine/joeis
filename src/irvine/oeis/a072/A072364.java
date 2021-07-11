package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A072364 Decimal expansion of (1/e)^(1/e).
 * @author Sean A. Irvine
 */
public class A072364 extends DecimalExpansionSequence {

  private static final CR INV_E = CR.E.inverse();

  /** Construct the sequence. */
  public A072364() {
    super(INV_E.pow(INV_E));
  }
}
