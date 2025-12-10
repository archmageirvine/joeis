package irvine.oeis.a082;

import irvine.oeis.InverseSequence;

/**
 * A082468 a(n) is the smallest positive integer such that k=n where k is the least positive integer such that n-k and n+k are both primes.
 * @author Sean A. Irvine
 */
public class A082468 extends InverseSequence {

  /** Construct the sequence. */
  public A082468() {
    super(4, 1, new A082467());
  }
}

