package irvine.oeis.a082;

import irvine.oeis.PrependSequence;
import irvine.oeis.a070.A070934;

/**
 * A082244 Smallest odd prime that is the sum of 2n+1 consecutive primes.
 * @author Sean A. Irvine
 */
public class A082244 extends PrependSequence {

  /** Construct the sequence. */
  public A082244() {
    super(0, new A070934().skip(), 3);
  }
}
