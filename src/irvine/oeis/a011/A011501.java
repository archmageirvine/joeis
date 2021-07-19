package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011501 Decimal expansion of 82nd root of 82.
 * @author Sean A. Irvine
 */
public class A011501 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(82);

  /** Construct the sequence. */
  public A011501() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
