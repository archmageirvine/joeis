package irvine.oeis.a165;

import irvine.oeis.FiniteSequence;

/**
 * A165805 Integers that start a trajectory <code>x -&gt; A008619(x)</code> which contains only primes until terminating at 2 or 3.
 * @author Georg Fischer
 */
public class A165805 extends FiniteSequence {

  /** Construct the sequence. */
  public A165805() {
    super(2, 3, 4, 5, 6, 7, 10, 11, 14, 15, 22, 23, 46, 47, 94, 95);
  }
}
