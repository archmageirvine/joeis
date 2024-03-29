package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011512 Decimal expansion of 93rd root of 93.
 * @author Sean A. Irvine
 */
public class A011512 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(93);

  /** Construct the sequence. */
  public A011512() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
