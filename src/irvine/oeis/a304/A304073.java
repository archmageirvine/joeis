package irvine.oeis.a304;

import irvine.oeis.transform.PairTransformSequence;

/**
 * A304073 Number of simple connected graphs with n nodes rooted at one oriented non-edge.
 * @author Gregory Morse
 */
public class A304073 extends PairTransformSequence {
  /** Construct the sequence. */
  public A304073() {
    super(1, new A304074(), new A304072(), (n, u, v) -> u.subtract(v));
  }
}
