package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011513 Decimal expansion of 94th root of 94.
 * @author Sean A. Irvine
 */
public class A011513 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(94);

  /** Construct the sequence. */
  public A011513() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
