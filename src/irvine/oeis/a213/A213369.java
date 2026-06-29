package irvine.oeis.a213;
// manually 2026-06-29*

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A213369 The twisted Stern sequence: a(0) = 0, a(1) = 1 and a(2n) = -a(n), a(2n + 1) = -a(n)-a(n + 1) for n&gt;=1.
 * @author Georg Fischer
 */
public class A213369 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A213369() {
    super(0, (self, n) -> ((n & 1) == 0) ? self.a(n / 2).negate() : self.a(n / 2).negate().subtract(self.a(n / 2 + 1)), "0,1");
  }
}
