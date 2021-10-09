package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011478 Decimal expansion of 59th root of 59.
 * @author Sean A. Irvine
 */
public class A011478 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(59);

  /** Construct the sequence. */
  public A011478() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
