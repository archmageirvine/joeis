package irvine.oeis.a054;

import irvine.oeis.RecordSequence;

/**
 * A054691 New records in A054690 (start of n consecutive non-twin primes).
 * @author Sean A. Irvine
 */
public class A054691 extends RecordSequence {

  /** Construct the sequence. */
  public A054691() {
    super(new A054690());
  }
}

