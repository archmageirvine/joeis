package irvine.oeis.a114;
// Generated by gen_seq4.pl decexpr at 2021-07-13 19:05

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A114940 Decimal expansion of the infinite sum Sum_{k&gt;=1} sin(k)/k!.
 * @author Georg Fischer
 */
public class A114940 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A114940() {
    super(1, CR.ONE.sin().sin().multiply(REALS.cosh(CR.ONE.cos()).add(REALS.sinh(CR.ONE.cos()))));
  }
}
