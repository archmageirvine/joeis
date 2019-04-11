package irvine.oeis.a085;

import irvine.oeis.FiniteSequence;

/**
 * A085699 Smallest multiple of n such that <code>a(n) + a(n-1)</code> is an n-th power.
 * @author Georg Fischer
 */
public class A085699 extends FiniteSequence {

  /** Construct the sequence. */
  public A085699() {
    super(1, 8, 117, 508, 32260, 229884, 19257287);
  }
}
