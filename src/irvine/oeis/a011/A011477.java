package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011477 Decimal expansion of 58th root of 58.
 * @author Sean A. Irvine
 */
public class A011477 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(58);

  /** Construct the sequence. */
  public A011477() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
