package irvine.oeis.a231;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A231737 Decimal expansion of the natural logarithm of Pi^(1/Pi).
 * Formula: log(Pi^(1/Pi))
 * @author Georg Fischer
 */
public class A231737 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A231737() {
    super(0, CR.PI.pow(CR.ONE.divide(CR.PI)).log());
  }
}
