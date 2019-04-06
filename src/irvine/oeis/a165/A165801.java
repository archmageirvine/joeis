package irvine.oeis.a165;

import irvine.oeis.FiniteSequence;

/**
 * A165801 f(n), f(f(n)), ... are all prime, where f(n) = (n-1)/2. Stop when f(...f(n)...) is less than 4.
 * @author Georg Fischer
 */
public class A165801 extends FiniteSequence {

  /** Construct the sequence. */
  public A165801() {
    super(1, 2, 3, 5, 7, 11, 15, 23, 47, 95);
  }
}
