package irvine.oeis.a185;
// Generated by gen_seq4.pl 2024-12-14.ack/multrar at 2024-12-14 16:31

import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A185183 G.f. A(x) satisfies A(x) = 1+x + x^2*[d/dx A(x)^2].
 * @author Georg Fischer
 */
public class A185183 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A185183() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, n - 1, k -> self.a(k).multiply(self.a(n - k - 1))).multiply(n - 1), "1,1");
  }
}
