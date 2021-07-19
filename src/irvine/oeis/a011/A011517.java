package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011517 Decimal expansion of 98th root of 98.
 * @author Sean A. Irvine
 */
public class A011517 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(98);

  /** Construct the sequence. */
  public A011517() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
