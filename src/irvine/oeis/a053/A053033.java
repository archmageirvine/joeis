package irvine.oeis.a053;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a045.A045917;

/**
 * A053033 Numbers which are the average of two primes in more ways than any smaller number.
 * @author Sean A. Irvine
 */
public class A053033 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A053033() {
    super(new A045917(), 1);
  }
}
