package irvine.oeis.a376;
// Generated by gen_seq4.pl 2024-09-16.ack/multrar at 2024-09-16 19:36

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A376126 a(n) = 1 + Sum_{k=0..n-1} (k+1)^2 * a(k) * a(n-k-1).
 * @author Georg Fischer
 */
public class A376126 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A376126() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, n - 1, k -> Z.valueOf(k + 1).square().multiply(self.a(k)).multiply(self.a(n - k - 1))).add(1), "");
  }
}
