package irvine.oeis.a084;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002313;

/**
 * A084164 Index of the primes in A084163.
 * @author Sean A. Irvine
 */
public class A084164 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A084164() {
    super(1, 1, new A002313(), (n, k) -> k.mod(n) == n - 1);
  }
}

