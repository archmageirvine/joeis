package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011484 Decimal expansion of 65th root of 65.
 * @author Sean A. Irvine
 */
public class A011484 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(65);

  /** Construct the sequence. */
  public A011484() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
