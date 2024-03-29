package irvine.oeis.a256;
// Generated by gen_seq4.pl decexp at 2021-07-13 19:05

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A256782 Decimal expansion of the generalized Euler constant gamma(3,8).
 * @author Georg Fischer
 */
public class A256782 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A256782() {
    super(0, CR.GAMMA.divide(CR.EIGHT).add(CR.ONE.divide(CR.EIGHT).multiply(CR.PI.divide(CR.TWO).multiply(CR.TWO.sqrt().subtract(CR.ONE)).add(CR.TWO.log()).subtract(CR.TWO.sqrt().multiply(CR.TWO.sqrt().add(CR.ONE).log())))));
  }
}
