package irvine.oeis.a270;
// manually 2023-10-03

import irvine.math.q.Q;
import irvine.oeis.a000.A000045;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A270313 Denominator of Fibonacci(n)/n.
 * @author Georg Fischer
 */
public class A270313 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A270313() {
    super(1, new A000045().skip(1), (n, v) -> new Q(v, n).den());
  }
}
