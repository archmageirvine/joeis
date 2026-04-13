package irvine.oeis.a084;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a082.A082785;

/**
 * A084418 Numbers n with property that n sets a new record for number of ways to write n as the sum of a brilliant number and a prime.
 * @author Sean A. Irvine
 */
public class A084418 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A084418() {
    super(1, 1, new A082785());
  }
}
