package irvine.oeis.a038;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002145;

/**
 * A038347 Sum of first n primes of form 4k-1.
 * @author Sean A. Irvine
 */
public class A038347 extends PartialSumSequence {

  /** Construct the sequence. */
  public A038347() {
    super(1, new A002145());
  }
}
