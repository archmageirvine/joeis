package irvine.oeis.a395;

import irvine.oeis.a256.A256099;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395810 Decimal expansion of the real solution of the equation 2*x^3 - 2*x^2 + 2*x - 1 = 0.
 * @author Sean A. Irvine
 */
public class A395810 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395810() {
    super(0, new A256099().getCR().inverse());
  }
}
