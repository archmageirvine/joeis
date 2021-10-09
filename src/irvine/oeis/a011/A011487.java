package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011487 Decimal expansion of 68th root of 68.
 * @author Sean A. Irvine
 */
public class A011487 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(68);

  /** Construct the sequence. */
  public A011487() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
