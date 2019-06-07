package irvine.oeis.a085;

import irvine.oeis.FiniteSequence;

/**
 * A085070 <code>a(1) = 1</code>; then the smallest number <code>a(n) == -1 mod a(n-1)</code> such that <code>tau(a(n)) = n</code>.
 * @author Georg Fischer
 */
public class A085070 extends FiniteSequence {

  /** Construct the sequence. */
  public A085070() {
    super(1, 2, 9, 26);
  }
}
