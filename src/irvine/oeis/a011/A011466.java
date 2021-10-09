package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011466 Decimal expansion of 47th root of 47.
 * @author Sean A. Irvine
 */
public class A011466 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(47);

  /** Construct the sequence. */
  public A011466() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
