package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085667 Decimal expansion of e^e^e^e.
 * @author Sean A. Irvine
 */
public class A085667 extends DecimalExpansionSequence {

  private static CR build() {
    // This effectively moves the decimal point left to a range where things are faster
    final CR x = CR.E.exp().exp();
    final CR r = x.subtract(CR.valueOf(x.divide(CR.LOG10).floor()).multiply(CR.LOG10));
    return r.exp();
  }

  /** Construct the sequence. */
  public A085667() {
    super(1656521, build());
  }
}
