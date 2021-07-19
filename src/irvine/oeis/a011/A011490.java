package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011490 Decimal expansion of 71st root of 71.
 * @author Sean A. Irvine
 */
public class A011490 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(71);

  /** Construct the sequence. */
  public A011490() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
