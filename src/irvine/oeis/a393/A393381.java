package irvine.oeis.a393;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a152.A152991;

/**
 * A393381 Numbers k such that sigma(k) - pi(k) is prime.
 * @author Sean A. Irvine
 */
public class A393381 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A393381() {
    super(1, new A152991(), PRIME);
  }
}
