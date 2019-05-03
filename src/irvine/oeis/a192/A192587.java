package irvine.oeis.a192;

import irvine.oeis.FiniteSequence;

/**
 * A192587 Monotonic ordering of set S generated by these rules: if x and y are in S and <code>xy-1</code> is a prime, then <code>xy-1</code> is in S, and <code>2, 4</code>, and 6 are in S.
 * @author Georg Fischer
 */
public class A192587 extends FiniteSequence {

  /** Construct the sequence. */
  public A192587() {
    super(2, 3, 4, 5, 6, 7, 11, 13, 17, 19, 23, 29, 37, 41, 43, 67, 73, 101, 113, 137, 163, 173, 257, 401, 547, 677, 691, 821, 977, 1093, 1381, 2707, 3907, 5413, 5861);
  }
}
