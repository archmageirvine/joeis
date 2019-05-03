package irvine.oeis.a254;

import irvine.oeis.FiniteSequence;

/**
 * A254317 <code>a(n)</code> is the least number k such that the number of distinct digits in the prime factorization of k is <code>n (counting</code> terms of the form <code>p^1</code> as <code>p)</code>.
 * @author Georg Fischer
 */
public class A254317 extends FiniteSequence {

  /** Construct the sequence. */
  public A254317() {
    super(1, 6, 26, 102, 510, 3210, 22890, 153690, 1507290, 15618090);
  }
}
