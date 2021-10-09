package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011475 Decimal expansion of 56th root of 56.
 * @author Sean A. Irvine
 */
public class A011475 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(56);

  /** Construct the sequence. */
  public A011475() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
