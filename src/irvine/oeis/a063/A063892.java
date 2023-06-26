package irvine.oeis.a063;

import irvine.oeis.FiniteSequence;

/**
 * A063892 a(1) = a(2) = a(3) = 1, a(n) = a(n-a(n-2))+a(n-a(n-3)) for n&gt;3.
 * @author Georg Fischer
 */
public class A063892 extends FiniteSequence {

  /** Construct the sequence. */
  public A063892() {
    super(1, FINITE, 1, 1, 1, 2, 4, 6, 5, 3, 3, 9, 6, 4, 7, 12, 9, 5, 7, 10, 16, 16, 10, 12, 12, 16, 14, 21, 13, 17, 8, 14, 24, 26, 19, 12, 8, 23, 22, 23, 12, 17, 18, 28, 35, 26, 16, 22, 34, 47, 22, 6, 10, 36, 69, 36);
  }
}
