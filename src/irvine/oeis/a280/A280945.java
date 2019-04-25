package irvine.oeis.a280;

import irvine.oeis.FiniteSequence;

/**
 * A280945 List of primitive triples <code>(x, y, z)</code> of positive integers for which <code>xy - z, yz - x,</code> and <code>zx - y</code> are powers of 2.
 * @author Georg Fischer
 */
public class A280945 extends FiniteSequence {

  /** Construct the sequence. */
  public A280945() {
    super(2, 2, 2, 2, 2, 3, 2, 6, 11, 3, 5, 7);
  }
}
