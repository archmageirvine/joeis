package irvine.oeis.a071;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000010;

/**
 * A071576.
 * @author Sean A. Irvine
 */
public class A071601 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A071601() {
    super(1, 1, new A000010(), (n, k) -> Integer.bitCount(n) == k.bitCount());
  }
}

