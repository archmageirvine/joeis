package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011468 Decimal expansion of 49th root of 49.
 * @author Sean A. Irvine
 */
public class A011468 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(49);

  /** Construct the sequence. */
  public A011468() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
