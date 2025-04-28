package irvine.oeis.a077;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a073.A073579;

/**
 * A077039 Sums of first n signatured primes (A073579).
 * @author Sean A. Irvine
 */
public class A077039 extends PartialSumSequence {

  /** Construct the sequence. */
  public A077039() {
    super(1, new A073579());
  }
}

