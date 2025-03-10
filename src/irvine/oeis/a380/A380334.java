package irvine.oeis.a380;
// manually 2025-03-04/decexp at 2025-03-07 11:36

import irvine.oeis.a338.A338460;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A380334 Decimal expansion of the smallest possible average gap for the prime number subsequence P" = A262275.
 * Formula: x*(x-1) where x = A338460.getCR().
 * @author Georg Fischer
 */
public class A380334 extends DecimalExpansionSequence {

  private static final DecimalExpansionSequence A338460 = new A338460();

  /** Construct the sequence */
  public A380334() {
    super(1, A338460.getCR().multiply(A338460.getCR().subtract(1)));
  }
}
