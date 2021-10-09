package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011483 Decimal expansion of 64th root of 64.
 * @author Sean A. Irvine
 */
public class A011483 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(64);

  /** Construct the sequence. */
  public A011483() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
