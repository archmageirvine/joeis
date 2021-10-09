package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011443 Decimal expansion of 24th root of 24.
 * @author Sean A. Irvine
 */
public class A011443 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(24);

  /** Construct the sequence. */
  public A011443() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
