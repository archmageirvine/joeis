package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011485 Decimal expansion of 66th root of 66.
 * @author Sean A. Irvine
 */
public class A011485 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(66);

  /** Construct the sequence. */
  public A011485() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
