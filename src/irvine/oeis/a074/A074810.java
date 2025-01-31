package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a035.A035250;

/**
 * A074810 Numbers k such that the number of primes between k and 2k (inclusive) = largest prime factor of k.
 * @author Sean A. Irvine
 */
public class A074810 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A074810() {
    super(1, 1, new A035250(), (n, k) -> k.equals(Functions.GPF.z(n)));
  }
}
