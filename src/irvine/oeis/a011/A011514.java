package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011514 Decimal expansion of 95th root of 95.
 * @author Sean A. Irvine
 */
public class A011514 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(95);

  /** Construct the sequence. */
  public A011514() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
