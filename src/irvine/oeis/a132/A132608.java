package irvine.oeis.a132;
// manually rootet at 2023-02-20 10:45

import irvine.oeis.a062.A062817;
import irvine.oeis.transform.RootSequence;

/**
 * A132608 Self-convolution square-root of A062817 (offset 2); thus g.f. A(x) satisfies: A(x)^2 = Sum_{n&gt;=2} A062817(n)*x^n, where A062817(n) = Sum_{k=0..n} (n-k)^k*k^(n-k).
 * @author Georg Fischer
 */
public class A132608 extends RootSequence {

  /** Construct the sequence. */
  public A132608() {
    super(1, new A062817().skip(2), 1, 2);
  }
}
