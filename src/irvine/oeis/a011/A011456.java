package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011456 Decimal expansion of 37th root of 37.
 * @author Sean A. Irvine
 */
public class A011456 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(37);

  /** Construct the sequence. */
  public A011456() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
