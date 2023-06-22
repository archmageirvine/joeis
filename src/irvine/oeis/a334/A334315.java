package irvine.oeis.a334;

import irvine.oeis.a000.A000041;
import irvine.oeis.transform.ExponentialRevertTransformSequence;

/**
 * A334315 E.g.f. A(x) satisfies: A(x) = x - Sum_{k&gt;=2} p(k) * A(x)^k / k!, where p = A000041 (partition numbers).
 * @author Georg Fischer
 */
public class A334315 extends ExponentialRevertTransformSequence {

  /** Construct the sequence. */
  public A334315() {
    super(1, new A000041().skip(1));
  }

}
