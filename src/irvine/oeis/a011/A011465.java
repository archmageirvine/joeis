package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011465 Decimal expansion of 46th root of 46.
 * @author Sean A. Irvine
 */
public class A011465 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(46);

  /** Construct the sequence. */
  public A011465() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
