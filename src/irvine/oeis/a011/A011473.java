package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011473 Decimal expansion of 54th root of 54.
 * @author Sean A. Irvine
 */
public class A011473 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(54);

  /** Construct the sequence. */
  public A011473() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
