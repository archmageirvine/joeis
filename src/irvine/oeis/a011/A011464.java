package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011464 Decimal expansion of 45th root of 45.
 * @author Sean A. Irvine
 */
public class A011464 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(45);

  /** Construct the sequence. */
  public A011464() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
