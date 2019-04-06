package irvine.oeis.a037;

import irvine.oeis.FiniteSequence;

/**
 * A037171 Numbers n such that phi(n) = pi(n), i.e., A000010(n) = A000720(n).
 * @author Georg Fischer
 */
public class A037171 extends FiniteSequence {

  /** Construct the sequence. */
  public A037171() {
    super(2, 3, 4, 8, 10, 14, 20, 90);
  }
}
