package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011474 Decimal expansion of 55th root of 55.
 * @author Sean A. Irvine
 */
public class A011474 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(55);

  /** Construct the sequence. */
  public A011474() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
