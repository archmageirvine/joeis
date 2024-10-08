package irvine.oeis.a197;
// Generated by gen_seq4.pl decexpr at 2021-07-19 22:15

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197376 Decimal expansion of least x&gt;0 having sin(x)=(sin (x/2))^2.
 * Formula: 2*atan(2)
 * @author Georg Fischer
 */
public class A197376 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A197376() {
    super(1, CR.TWO.multiply(REALS.atan(CR.TWO)));
  }
}
