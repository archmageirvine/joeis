package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011454 Decimal expansion of 35th root of 35.
 * @author Sean A. Irvine
 */
public class A011454 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(35);

  /** Construct the sequence. */
  public A011454() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
