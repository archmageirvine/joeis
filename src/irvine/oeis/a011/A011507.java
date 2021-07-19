package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011507 Decimal expansion of 88th root of 88.
 * @author Sean A. Irvine
 */
public class A011507 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(88);

  /** Construct the sequence. */
  public A011507() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
