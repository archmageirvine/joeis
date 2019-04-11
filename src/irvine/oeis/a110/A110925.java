package irvine.oeis.a110;

import irvine.oeis.FiniteSequence;

/**
 * A110925 <code>a(1) = 1</code>; for <code>n&gt;1, a(n)</code> is the smallest positive integer such that the continued fraction <code>[a(1),a(2),a(3),</code>...,a(n)] has numerator divisible by n.
 * @author Georg Fischer
 */
public class A110925 extends FiniteSequence {

  /** Construct the sequence. */
  public A110925() {
    super(1, 1, 1, 2, 4, 2, 7, 2, 7, 10, 5, 10, 4, 2, 7, 2, 9);
  }
}
