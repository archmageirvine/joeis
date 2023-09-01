package irvine.oeis.a065;

import irvine.oeis.RecordSequence;

/**
 * A065388 Record values for sigma(m) + phi(m): sum of sigma and totient is larger than for any previous number.
 * @author Sean A. Irvine
 */
public class A065388 extends RecordSequence {

  /** Construct the sequence. */
  public A065388() {
    super(new A065387());
  }
}
