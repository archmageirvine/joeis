package irvine.oeis.a280;

import irvine.oeis.FiniteSequence;

/**
 * A280945 List of primitive triples <code>(x,</code> y, z) of positive integers for which xy - z, yz <code>- x,</code> and zx - y are powers of 2.
 * @author Georg Fischer
 */
public class A280945 extends FiniteSequence {

  /** Construct the sequence. */
  public A280945() {
    super(2, 2, 2, 2, 2, 3, 2, 6, 11, 3, 5, 7);
  }
}
