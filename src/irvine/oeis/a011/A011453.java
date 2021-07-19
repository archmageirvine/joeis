package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011453 Decimal expansion of 34th root of 34.
 * @author Sean A. Irvine
 */
public class A011453 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(34);

  /** Construct the sequence. */
  public A011453() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
