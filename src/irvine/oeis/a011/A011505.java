package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011505 Decimal expansion of 86th root of 86.
 * @author Sean A. Irvine
 */
public class A011505 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(86);

  /** Construct the sequence. */
  public A011505() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
