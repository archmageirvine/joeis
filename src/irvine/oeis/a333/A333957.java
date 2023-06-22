package irvine.oeis.a333;

import irvine.oeis.a000.A000203;
import irvine.oeis.transform.ExponentialRevertTransformSequence;

/**
 * A333957 E.g.f. A(x) satisfies: A(x) = x - Sum_{k&gt;=2} sigma(k) * A(x)^k / k!.
 * @author Georg Fischer
 */
public class A333957 extends ExponentialRevertTransformSequence {

  /** Construct the sequence. */
  public A333957() {
    super(1, new A000203());
  }
}
