package irvine.oeis.a071;

import irvine.oeis.FilterPositionSequence;

/**
 * A071147.
 * @author Sean A. Irvine
 */
public class A071218 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A071218() {
    super(1, 1, new A071216(), (n, k) -> k.compareTo(n) <= 0);
  }
}
