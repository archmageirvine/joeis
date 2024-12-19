package irvine.oeis.a073;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a019.A019515;

/**
 * A073827 Numbers n such that 1 + 0!*1!*2!*...*n! is prime.
 * @author Sean A. Irvine
 */
public class A073827 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073827() {
    super(1, 0, new A019515(), PRIME);
  }
}
