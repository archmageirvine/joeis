package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011457 Decimal expansion of 38th root of 38.
 * @author Sean A. Irvine
 */
public class A011457 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(38);

  /** Construct the sequence. */
  public A011457() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
