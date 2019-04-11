package irvine.oeis.a101;

import irvine.oeis.FiniteSequence;

/**
 * A101171 <code>a(n)</code> divides the number formed by concatenating the sum of the digits of <code>a(n)</code> with <code>a(n),</code> by a factor not previously used.
 * @author Georg Fischer
 */
public class A101171 extends FiniteSequence {

  /** Construct the sequence. */
  public A101171() {
    super(1, 12, 15, 18, 25, 45, 75, 125, 1125, 1875, 5625, 16875, 140625, 1171875);
  }
}
