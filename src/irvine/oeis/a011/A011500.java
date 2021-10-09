package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011500 Decimal expansion of 81st root of 81.
 * @author Sean A. Irvine
 */
public class A011500 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(81);

  /** Construct the sequence. */
  public A011500() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
