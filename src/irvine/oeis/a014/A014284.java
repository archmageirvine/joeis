package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a008.A008578;

/**
 * A014284 Partial sums of primes, if 1 is regarded as a prime (as it was until quite recently, see A008578).
 * @author Sean A. Irvine
 */
public class A014284 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014284() {
    super(1, new A008578());
  }
}

