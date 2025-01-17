package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;

/**
 * A074252 Number of primes &lt;= n is equal to the sum of squarefree numbers from the smallest prime factor of n to the largest prime factor of n.
 * @author Sean A. Irvine
 */
public class A074252 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A074252() {
    super(0, 1, new A074251(), (n, k) -> k.equals(Functions.PRIME_PI.z(n)));
  }
}
