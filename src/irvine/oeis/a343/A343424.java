package irvine.oeis.a343;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a025.A025281;

/**
 * A343424 Numbers k such that sopfr((k-1)!) is divisible by k, where sopfr(k) = A001414(k) = sum of primes, with repetition, dividing k.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A343424 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A343424() {
    super(1, 1, new A025281(), (n, k) -> k.mod(n) == 0);
  }
}
