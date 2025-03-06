package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000045;

/**
 * A075740 Squarefree Fibonacci numbers which are the product of an even number of distinct primes and whose index is also squarefree and the product of an even number of distinct primes.
 * @author Sean A. Irvine
 */
public class A075740 extends FilterSequence {

  /** Construct the sequence. */
  public A075740() {
    super(1, new A000045().skip(), 1, (n, k) -> Functions.MOBIUS.i(n) == 1 && Functions.MOBIUS.i(k) == 1);
  }
}
