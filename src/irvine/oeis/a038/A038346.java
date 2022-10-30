package irvine.oeis.a038;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002144;

/**
 * A038346 Sum of first n primes of form 4k+1.
 * @author Sean A. Irvine
 */
public class A038346 extends PartialSumSequence {

  /** Construct the sequence. */
  public A038346() {
    super(1, new A002144());
  }
}
