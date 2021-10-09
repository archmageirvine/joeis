package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011518 Decimal expansion of 99th root of 99.
 * @author Sean A. Irvine
 */
public class A011518 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(99);

  /** Construct the sequence. */
  public A011518() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
