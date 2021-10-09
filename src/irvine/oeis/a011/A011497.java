package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011497 Decimal expansion of 78th root of 78.
 * @author Sean A. Irvine
 */
public class A011497 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(78);

  /** Construct the sequence. */
  public A011497() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
