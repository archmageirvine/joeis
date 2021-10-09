package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011467 Decimal expansion of 48th root of 48.
 * @author Sean A. Irvine
 */
public class A011467 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(48);

  /** Construct the sequence. */
  public A011467() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
