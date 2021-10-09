package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011492 Decimal expansion of 73rd root of 73.
 * @author Sean A. Irvine
 */
public class A011492 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(73);

  /** Construct the sequence. */
  public A011492() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
