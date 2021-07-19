package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011480 Decimal expansion of 61st root of 61.
 * @author Sean A. Irvine
 */
public class A011480 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(61);

  /** Construct the sequence. */
  public A011480() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
