package irvine.oeis.a071;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a004.A004087;

/**
 * A071602 Sum of the reverses of the first n primes.
 * @author Sean A. Irvine
 */
public class A071602 extends PartialSumSequence {

  /** Construct the sequence. */
  public A071602() {
    super(1, new A004087());
  }
}
