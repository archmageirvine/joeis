package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011519 Decimal expansion of 100th root of 100.
 * @author Sean A. Irvine
 */
public class A011519 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(100);

  /** Construct the sequence. */
  public A011519() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
