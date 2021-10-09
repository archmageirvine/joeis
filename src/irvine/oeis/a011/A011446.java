package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011446 Decimal expansion of 27th root of 27.
 * @author Sean A. Irvine
 */
public class A011446 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(27);

  /** Construct the sequence. */
  public A011446() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
