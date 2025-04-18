package irvine.oeis.a372;
// Generated by gen_seq4.pl 2025-02-20.ack/multrar at 2025-02-20 23:05

import irvine.math.q.Q;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A372982 a(n) = floor((a(n-1)+a(n-2)+n)/(a(n-3)+1)), where a(1)=1, a(2)=2, a(3)=3.
 * @author Georg Fischer
 */
public class A372982 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A372982() {
    super(1, (self, n) -> new Q(self.a(n - 1).add(self.a(n - 2)).add(n), self.a(n - 3).add(1)).floor(), "1, 2, 3");
  }
}
