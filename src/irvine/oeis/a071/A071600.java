package irvine.oeis.a071;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000040;

/**
 * A071576.
 * @author Sean A. Irvine
 */
public class A071600 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A071600() {
    super(1, 1, new A000040(), (n, k) -> Integer.bitCount(n) == k.bitCount());
  }
}

