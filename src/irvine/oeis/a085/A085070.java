package irvine.oeis.a085;

import irvine.oeis.FiniteSequence;

/**
 * A085070 a(1) = 1; then the smallest number a(n) == -1 mod a(n-1) such that tau(a(n)) = n.
 * @author Georg Fischer
 */
public class A085070 extends FiniteSequence {

  /** Construct the sequence. */
  public A085070() {
    super(1, 2, 9, 26);
  }
}
