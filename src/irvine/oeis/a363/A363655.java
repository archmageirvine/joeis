package irvine.oeis.a363;
// Generated by gen_seq4.pl 2024-12-14.ack/multrar at 2024-12-14 16:31

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A363655 a(0) = 1; for n &gt; 0, a(n) = prime( Sum_{k=0..n-1} a(k) * a(n-k-1) ).
 * @author Georg Fischer
 */
public class A363655 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A363655() {
    super(0, (self, n) -> Functions.PRIME.z(Integers.SINGLETON.sum(0, n - 1, k -> self.a(k).multiply(self.a(n - k - 1)))), "1");
  }
}
