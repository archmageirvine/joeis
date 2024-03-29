package irvine.oeis.a256;
// Generated by gen_seq4.pl decexp at 2021-07-13 19:05

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A256921 Decimal expansion of Sum_{k&gt;=2} zeta(k)/(k*2^k).
 * @author Georg Fischer
 */
public class A256921 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A256921() {
    super(0, CR.ONE.divide(CR.TWO).multiply(CR.PI.log()).subtract(CR.GAMMA.divide(CR.TWO)));
  }
}
