package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011506 Decimal expansion of 87th root of 87.
 * @author Sean A. Irvine
 */
public class A011506 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(87);

  /** Construct the sequence. */
  public A011506() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
