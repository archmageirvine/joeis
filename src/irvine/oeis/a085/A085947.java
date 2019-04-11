package irvine.oeis.a085;

import irvine.oeis.FiniteSequence;

/**
 * A085947 <code>a(1) = 1, a(2) = 2</code> and <code>a(n) =</code> smallest number not included earlier that divides the sum of the two previous terms.
 * @author Georg Fischer
 */
public class A085947 extends FiniteSequence {

  /** Construct the sequence. */
  public A085947() {
    super(1, 2, 3, 5, 4, 9, 13, 11, 6, 17, 23, 8, 31, 39, 7, 46, 53, 33, 43, 19, 62, 27, 89, 29, 59, 22, 81, 103, 92, 15, 107, 61, 12, 73, 85, 79, 41, 10, 51);
  }
}
