package irvine.oeis.a079;
// Generated by gen_seq4.pl 2024-08-02.ack/multrar at 2024-08-02 23:54

import irvine.math.function.Functions;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A079883 a(1) = 1; a(n) = prime(n) - prime(n-1)* a(n-1) if n &gt; 1.
 * @author Georg Fischer
 */
public class A079883 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A079883() {
    super(1, (self, n) -> Functions.PRIME.z(n).subtract(Functions.PRIME.z(n - 1).multiply(self.a(n - 1))), "1");
  }
}
