package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011508 Decimal expansion of 89th root of 89.
 * @author Sean A. Irvine
 */
public class A011508 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(89);

  /** Construct the sequence. */
  public A011508() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
