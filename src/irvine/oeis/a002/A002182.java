package irvine.oeis.a002;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a000.A000005;

/**
 * A002182 Highly composite numbers: numbers n where d(n), the number of divisors of n (A000005), increases to a record.
 * @author Sean A. Irvine
 */
public class A002182 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A002182() {
    super(1, new A000005(), 1);
  }
}
