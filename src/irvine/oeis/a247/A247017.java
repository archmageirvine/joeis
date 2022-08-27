package irvine.oeis.a247;
// manually 2022-08-27

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A247017 Decimal expansion of integral_{0..infinity} exp(-x^2)*log(x) dx.
 * @author Georg Fischer
 */
public class A247017 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A247017() {
    super(0, CR.ZERO.subtract(CR.ONE.divide(CR.FOUR).multiply(CR.PI.sqrt()).multiply(CR.GAMMA.add(CR.TWO.multiply(CR.TWO.log())))));
    next();
    next();
  }
}
