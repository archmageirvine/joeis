package irvine.oeis.a333;
// Generated by gen_seq4.pl 2025-04-09.ack/multia at 2025-04-09 21:37

import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A333121 a(1) = 1; a(n+1) = Product_{d|n} (1 + a(d)).
 * @author Georg Fischer
 */
public class A333121 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A333121() {
    super(1, (self, n) -> Integers.SINGLETON.productdiv(n - 1, d -> self.a(d).add(1)), "1");
  }
}
