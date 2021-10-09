package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011460 Decimal expansion of 41st root of 41.
 * @author Sean A. Irvine
 */
public class A011460 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(41);

  /** Construct the sequence. */
  public A011460() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
