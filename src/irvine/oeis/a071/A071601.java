package irvine.oeis.a071;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000010;

/**
 * A071601 Numbers k such that k and phi(k) have the same number of 1's in their binary representation.
 * @author Sean A. Irvine
 */
public class A071601 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A071601() {
    super(1, 1, new A000010(), (n, k) -> Integer.bitCount(n) == k.bitCount());
  }
}

