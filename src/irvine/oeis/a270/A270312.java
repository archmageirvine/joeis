package irvine.oeis.a270;
// manually 2023-10-03

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A270312 Numerator of Fibonacci(n)/n.
 * @author Georg Fischer
 */
public class A270312 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A270312() {
    super(1, new A000045().skip(1), (n, v) -> new Q(v, Z.valueOf(n)).num());
  }
}
