package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011482 Decimal expansion of 63rd root of 63.
 * @author Sean A. Irvine
 */
public class A011482 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(63);

  /** Construct the sequence. */
  public A011482() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
