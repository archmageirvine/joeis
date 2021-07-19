package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011471 Decimal expansion of 52nd root of 52.
 * @author Sean A. Irvine
 */
public class A011471 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(52);

  /** Construct the sequence. */
  public A011471() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
