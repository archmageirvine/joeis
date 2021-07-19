package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011479 Decimal expansion of 60th root of 60.
 * @author Sean A. Irvine
 */
public class A011479 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(60);

  /** Construct the sequence. */
  public A011479() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
