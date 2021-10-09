package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011489 Decimal expansion of 70th root of 70.
 * @author Sean A. Irvine
 */
public class A011489 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(70);

  /** Construct the sequence. */
  public A011489() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
