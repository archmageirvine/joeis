package irvine.oeis.a114;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.PI, CR.TWO).multiply(CR.PI.divide(CR.TWO).subtract(CR.ONE)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A114598 Decimal expansion of Pi^2*(Pi/2 - 1).
 * @author Georg Fischer
 */
public class A114598 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A114598() {
    super(REALS.pow(CR.PI, CR.TWO).multiply(CR.PI.divide(CR.TWO).subtract(CR.ONE)));
  }
}
