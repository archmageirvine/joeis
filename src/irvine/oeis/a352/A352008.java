package irvine.oeis.a352;
// Generated by gen_seq4.pl 2024-12-14.ack/multrar at 2024-12-14 16:31

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A352008 a(0) = 1; a(n) = Sum_{k=0..floor((n-1)/2)} 4^k * a(k) * a(n-2*k-1).
 * @author Georg Fischer
 */
public class A352008 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A352008() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, (n - 1) / 2, k -> Z.FOUR.pow(k).multiply(self.a(k)).multiply(self.a(n - 2 * k - 1))), "1");
  }
}
