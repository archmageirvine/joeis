package irvine.oeis.a175;

import irvine.oeis.FiniteSequence;

/**
 * A175565 a(n) = smallest prime &gt; a(n-1) such that in the sum a(n-1) + a(n) there are no carries, with a(1)=2.
 * @author Georg Fischer
 */
public class A175565 extends FiniteSequence {

  /** Construct the sequence. */
  public A175565() {
    super(2, 3, 5, 11, 13, 23, 31, 37, 41, 43, 53, 101, 103, 113, 131, 137, 151, 211, 223, 233, 241, 251, 307, 311, 313, 331, 337, 401, 421, 431, 433, 443, 503, 1009);
  }
}
