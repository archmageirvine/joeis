package irvine.oeis.a131;

import irvine.oeis.FiniteSequence;

/**
 * A131184 Table T(n,m): the length of the sequence b(1)=n, b(2)=m, b(i) = b(i-1)*b(i-2) mod 10 up to the end of b's first cycle.
 * @author Georg Fischer
 */
public class A131184 extends FiniteSequence {

  /** Construct the sequence. */
  public A131184() {
    super(1, 7, 6, 4, 2, 2, 6, 7, 3, 8, 6, 8, 6, 3, 6, 8, 6, 8, 6, 7, 6, 7, 2, 7, 6, 7, 6, 5, 6, 8, 3, 3, 3, 8, 6, 5, 3, 3, 3, 3, 1, 3, 3, 3, 3, 3, 6, 8, 3, 3, 1, 8, 6, 5, 6, 7, 6, 7, 2, 7, 6, 7, 6, 8, 6, 8, 6, 3, 6, 8, 6, 8, 3, 7, 6, 4, 2, 4, 6, 7, 3);
  }
}
