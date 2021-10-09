package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011481 Decimal expansion of 62nd root of 62.
 * @author Sean A. Irvine
 */
public class A011481 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(62);

  /** Construct the sequence. */
  public A011481() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
