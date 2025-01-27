package irvine.oeis.a112;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001608;

/**
 * A112881 Indices of prime Perrin numbers; values of n such that A001608(n) is prime.
 * @author Georg Fischer
 */
public class A112881 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A112881() {
    super(1, 1, new A001608().skip(), PRIME);
  }
}
