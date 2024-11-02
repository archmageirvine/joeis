package irvine.oeis.a072;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a039.A039993;

/**
 * A072857 Primeval numbers: numbers that set a record for the number of distinct primes that can be obtained by permuting some subset of their digits.
 * @author Sean A. Irvine
 */
public class A072857 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A072857() {
    super(0, new A039993(), 1);
  }
}

