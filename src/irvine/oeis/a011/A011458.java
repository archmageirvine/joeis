package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011458 Decimal expansion of 39th root of 39.
 * @author Sean A. Irvine
 */
public class A011458 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(39);

  /** Construct the sequence. */
  public A011458() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
