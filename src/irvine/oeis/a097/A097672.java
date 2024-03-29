package irvine.oeis.a097;
// Generated by gen_seq4.pl decexp at 2021-07-13 19:05

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A097672 Decimal expansion of the constant 6*exp(psi(5/6) + EulerGamma), where EulerGamma is the Euler-Mascheroni constant (A001620) and psi(x) is the digamma function.
 * @author Georg Fischer
 */
public class A097672 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A097672() {
    super(1, CR.ONE.divide(CR.valueOf(12).sqrt()).multiply(CR.PI.divide(CR.TWO).multiply(CR.THREE.sqrt()).exp()));
  }
}
