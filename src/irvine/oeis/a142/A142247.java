package irvine.oeis.a142;

import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000668;
import irvine.oeis.a057.A057737;
import irvine.oeis.a172.A172041;

/**
 * A142247 Primes of the form 2^p - 1, 2^p + 1, 2^p - 3, or 2^p + 3, where p is prime.
 * @author Sean A. Irvine
 */
public class A142247 extends UnionSequence {

  /** Construct the sequence. */
  public A142247() {
    super(1, new A000668(), new A172041(), new A057737());
  }
}

