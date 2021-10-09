package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011486 Decimal expansion of 67th root of 67.
 * @author Sean A. Irvine
 */
public class A011486 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(67);

  /** Construct the sequence. */
  public A011486() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
