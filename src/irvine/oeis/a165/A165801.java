package irvine.oeis.a165;

import irvine.oeis.FiniteSequence;

/**
 * A165801 <code>f(n), f(f(n)), .</code>.. are all prime, where <code>f(n) = (n-1)/2</code>. Stop when <code>f(...f(n)...)</code> is less than 4.
 * @author Georg Fischer
 */
public class A165801 extends FiniteSequence {

  /** Construct the sequence. */
  public A165801() {
    super(1, 2, 3, 5, 7, 11, 15, 23, 47, 95);
  }
}
