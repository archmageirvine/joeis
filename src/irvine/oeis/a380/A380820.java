package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-03-02.ack/multrar at 2025-03-02 23:03

import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A380820 a(0) = 0, a(1) = 1, and for n &gt;= 2, a(n) = a(n-1) + a(n-2) if a(n-1) &lt; n, otherwise a(n-1) - n.
 * @author Georg Fischer
 */
public class A380820 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A380820() {
    super(0, (self, n) -> (self.a(n - 1).compareTo(Z.valueOf(n)) < 0) ? self.a(n - 1).add(self.a(n - 2)) : self.a(n - 1).subtract(n), "0, 1");
  }
}
