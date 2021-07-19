package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011502 Decimal expansion of 83rd root of 83.
 * @author Sean A. Irvine
 */
public class A011502 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(83);

  /** Construct the sequence. */
  public A011502() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
