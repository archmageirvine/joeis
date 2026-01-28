package irvine.oeis.a073;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a066.A066417;

/**
 * A073957 Indices of records of the sum of the anti-divisors function.
 * @author Sean A. Irvine
 */
public class A073957 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A073957() {
    super(1, 1, new A066417());
  }
}
