package irvine.oeis.a085;

import irvine.oeis.FiniteSequence;

/**
 * A085709 <code>a(0)=1;</code> then smallest multiple of n such that <code>a(n) + a(n-1)</code> is a semiprime.
 * @author Georg Fischer
 */
public class A085709 extends FiniteSequence {

  /** Construct the sequence. */
  public A085709() {
    super(1, 3, 6, 3, 12, 10, 12, 14, 8, 18, 20, 66);
  }
}
