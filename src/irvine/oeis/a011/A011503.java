package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011503 Decimal expansion of 84th root of 84.
 * @author Sean A. Irvine
 */
public class A011503 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(84);

  /** Construct the sequence. */
  public A011503() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
