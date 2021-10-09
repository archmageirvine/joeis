package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A073743 Decimal expansion of cosh(1).
 * @author Sean A. Irvine
 */
public class A073743 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A073743() {
    super(REALS.cosh(CR.ONE));
  }
}
