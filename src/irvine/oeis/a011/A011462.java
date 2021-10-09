package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011462 Decimal expansion of 43rd root of 43.
 * @author Sean A. Irvine
 */
public class A011462 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(43);

  /** Construct the sequence. */
  public A011462() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
