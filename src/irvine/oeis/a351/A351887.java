package irvine.oeis.a351;
// Generated by gen_seq4.pl 2025-03-26.ack/multrar at 2025-03-26 22:40

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A351887 a(n) is the number of k &lt; n such that a(k) AND n = a(k) (where AND denotes the bitwise AND operator).
 * @author Georg Fischer
 */
public class A351887 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A351887() {
    super(0, (self, n) -> Integers.SINGLETON.count(0, n - 1, k -> self.a(k).and(Z.valueOf(n)).equals(self.a(k))), "");
  }
}
