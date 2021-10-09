package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011470 Decimal expansion of 51st root of 51.
 * @author Sean A. Irvine
 */
public class A011470 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(51);

  /** Construct the sequence. */
  public A011470() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
