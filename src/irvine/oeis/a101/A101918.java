package irvine.oeis.a101;
// Generated by gen_seq4.pl 2024-07-11/multrar at 2024-07-11 18:00

import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A101918 G.f. satisfies: A(x) = 1/(1 + x*A(x^8)) and also the continued fraction: 1 + x*A(x^9) = [1; 1/x, 1/x^8, 1/x^64, 1/x^512, ..., 1/x^(8^(n-1)), ...].
 * @author Georg Fischer
 */
public class A101918 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A101918() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, (n - 1) / 8, k -> self.a(k).multiply(self.a(n - 8 * k - 1))).negate(), "1");
  }
}
