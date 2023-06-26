package irvine.oeis.a049;

import irvine.oeis.FiniteSequence;

/**
 * A049499 A finite sequence of primes: the primes 671353+4^k for k=1, 2, 3, 4, 5, 6, 7, 8, 9.
 * @author Georg Fischer
 */
public class A049499 extends FiniteSequence {

  /** Construct the sequence. */
  public A049499() {
    super(1, FINITE, 671353, 671357, 671369, 671417, 671609, 672377, 675449, 687737, 736889, 933497);
  }
}
