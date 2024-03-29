package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011476 Decimal expansion of 57th root of 57.
 * @author Sean A. Irvine
 */
public class A011476 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(57);

  /** Construct the sequence. */
  public A011476() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
