package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011440 Decimal expansion of 21st root of 21.
 * @author Sean A. Irvine
 */
public class A011440 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(21);

  /** Construct the sequence. */
  public A011440() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
