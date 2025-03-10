package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000045;

/**
 * A075742 Fibonacci numbers for which both the value and index are the product of an odd number of distinct primes; that is, numbers Fibonacci(k) for which mu(k) = mu(Fibonacci(k)) = -1.
 * @author Sean A. Irvine
 */
public class A075742 extends FilterSequence {

  /** Construct the sequence. */
  public A075742() {
    super(1, new A000045().skip(), 1, (n, k) -> Functions.MOBIUS.i(n) == -1 && Functions.MOBIUS.i(k) == -1);
  }
}
