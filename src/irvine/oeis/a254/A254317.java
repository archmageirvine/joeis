package irvine.oeis.a254;

import irvine.oeis.FiniteSequence;

/**
 * A254317 a(n) is the least number k such that the number of distinct digits in the prime factorization of k is n (counting terms of the form p^1 as p).
 * @author Georg Fischer
 */
public class A254317 extends FiniteSequence {

  /** Construct the sequence. */
  public A254317() {
    super(1, FINITE, 1, 6, 26, 102, 510, 3210, 22890, 153690, 1507290, 15618090);
  }
}
