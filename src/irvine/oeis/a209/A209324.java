package irvine.oeis.a209;

import irvine.math.z.Z;
import irvine.oeis.a347.A347999;

/**
 * A209324 Triangular array read by rows: T(n,k) is the number of endofunctions f:{1,2,...,n}-&gt; {1,2,...,n} whose largest component has exactly k nodes; n&gt;=1, 1&lt;=k&lt;=n.
 * @author Gregory Morse
 */
public class A209324 extends A347999 {
  /** Construct the sequence. */
  public A209324() {
    setOffset(1);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return restricted(n + 1, 1, k + 1).subtract(restricted(n + 1, 1, k));
  }
}
