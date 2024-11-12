package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a006.A006862;

/**
 * A014545 Numbers k such that the k-th Euclid number A006862(k) = 1 + (Product of first k primes) is prime.
 * @author Sean A. Irvine
 */
public class A014545 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A014545() {
    super(0, new A006862(), Z::isProbablePrime);
  }
}
