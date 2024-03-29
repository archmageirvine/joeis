package irvine.oeis.a292;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A292819 Decimal expansion of Product_{k&gt;=1} (1 + exp(-Pi*k/2)).
 * Formula: exp(Pi/48)/(2^(1/16)*(sqrt(2)-1)^(1/4))
 * @author Georg Fischer
 */
public class A292819 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A292819() {
    super(1, CR.PI.divide(CR.valueOf(48)).exp().divide(CR.TWO.pow(CR.ONE.divide(CR.valueOf(16))).multiply(CR.TWO.sqrt().subtract(CR.ONE).pow(CR.ONE.divide(CR.FOUR)))));
  }
}
