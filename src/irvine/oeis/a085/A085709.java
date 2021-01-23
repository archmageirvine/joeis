package irvine.oeis.a085;

import irvine.oeis.FiniteSequence;

/**
 * A085709 a(0)=1; then smallest multiple of n such that a(n) + a(n-1) is a semiprime.
 * @author Georg Fischer
 */
public class A085709 extends FiniteSequence {

  /** Construct the sequence. */
  public A085709() {
    super(1, 3, 6, 3, 12, 10, 12, 14, 8, 18, 20, 66);
  }
}
