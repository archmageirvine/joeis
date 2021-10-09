package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011493 Decimal expansion of 74th root of 74.
 * @author Sean A. Irvine
 */
public class A011493 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(74);

  /** Construct the sequence. */
  public A011493() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
