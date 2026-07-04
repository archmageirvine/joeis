package irvine.oeis.a202;

import irvine.math.cr.CR;
import irvine.oeis.a073.A073234;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A202955 Decimal expansion of Pi^Pi^Pi^Pi.
 * @author Sean A. Irvine
 */
public class A202955 extends DecimalExpansionSequence {

  private static CR build() {
    // This effectively moves the decimal point left to a range where things are fast
    final CR x = new A073234().getCR();
    final CR a = CR.PI.log().divide(CR.LOG10).multiply(x);
    return CR.TEN.pow(a.frac());
  }

  /** Construct the sequence. */
  public A202955() {
    super(0, build());
  }
}
