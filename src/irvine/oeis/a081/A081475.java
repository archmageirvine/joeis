package irvine.oeis.a081;
// Generated by gen_seq4.pl 2025-04-30.ack/multia at 2025-04-30 23:37

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A081475 Consider the mapping f(x/y) = (x+y)/(2xy) where x/y is a reduced fraction. Beginning with x_0 = 1 and y_0 = 2, repeated application of this mapping produces a sequence of fractions x_n/y_n; a(n) is the n-th numerator.
 * @author Georg Fischer
 */
public class A081475 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A081475() {
    super(0, (self, n) -> self.a(n - 1).add(self.a(n - 2).multiply(2).multiply(self.a(n - 1).subtract(self.a(n - 2)))), "1, 3");
  }
}
