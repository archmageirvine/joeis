package irvine.oeis.a070;

import irvine.oeis.FilterPositionSequence;

/**
 * A070527 Numbers k such that cyclotomic(k, 2^k) is a prime number.
 * @author Sean A. Irvine
 */
public class A070527 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A070527() {
    super(1, new A070526(), PRIME);
  }
}
