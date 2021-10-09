package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011447 Decimal expansion of 28th root of 28.
 * @author Sean A. Irvine
 */
public class A011447 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(28);

  /** Construct the sequence. */
  public A011447() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
