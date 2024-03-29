package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011451 Decimal expansion of 32nd root of 32.
 * @author Sean A. Irvine
 */
public class A011451 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(32);

  /** Construct the sequence. */
  public A011451() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
