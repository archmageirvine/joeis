package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011461 Decimal expansion of 42nd root of 42.
 * @author Sean A. Irvine
 */
public class A011461 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(42);

  /** Construct the sequence. */
  public A011461() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
