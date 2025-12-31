package irvine.oeis.a082;

import irvine.oeis.RecordSequence;
import irvine.oeis.a002.A002375;

/**
 * A082918 Record-setting entries in A002375 (number of decompositions into two odd primes).
 * @author Sean A. Irvine
 */
public class A082918 extends RecordSequence {

  /** Construct the sequence. */
  public A082918() {
    super(1, new A002375().skip(2));
  }
}
