package irvine.oeis.a304;

import irvine.oeis.a303.A303830;
import irvine.oeis.a303.A303831;
import irvine.oeis.transform.PairTransformSequence;

/**
 * A304071 Number of simple connected graphs with n nodes rooted at one non-edge.
 * @author Gregory Morse
 */
public class A304071 extends PairTransformSequence {
  /** Construct the sequence. */
  public A304071() {
    super(1, new A303831(), new A303830(), (n, u, v) -> u.subtract(v));
  }
}
