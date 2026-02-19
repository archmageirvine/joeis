package irvine.oeis.a393;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a152.A152991;

/**
 * A393381 allocated for Lyle Blosser.
 * @author Sean A. Irvine
 */
public class A393381 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A393381() {
    super(1, new A152991(), PRIME);
  }
}
