package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000045;

/**
 * A084278 Squarefree numbers n which are the product of an even number of distinct primes such that Fibonacci(n) is also squarefree and the product of an even number of distinct primes.
 * @author Sean A. Irvine
 */
public class A084278 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A084278() {
    super(1, 1, new A000045().skip(), (n, k) -> Functions.MOBIUS.i(n) == 1 && Functions.MOBIUS.i(k) == 1);
  }
}
