package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011449 Decimal expansion of 30th root of 30.
 * @author Sean A. Irvine
 */
public class A011449 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(30);

  /** Construct the sequence. */
  public A011449() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
