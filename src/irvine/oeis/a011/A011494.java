package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011494 Decimal expansion of 75th root of 75.
 * @author Sean A. Irvine
 */
public class A011494 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(75);

  /** Construct the sequence. */
  public A011494() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
