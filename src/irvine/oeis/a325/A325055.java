package irvine.oeis.a325;
// Generated by gen_seq4.pl 2024-05-26/multrar at 2024-05-27 00:43

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A325055 a(0) = 0, a(1) = 1; a(2*n) = a(n-1) + a(n), a(2*n+1) = a(n+1) - a(n).
 * @author Georg Fischer
 */
public class A325055 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A325055() {
    super(0, (self, n2) -> {
      final int n = n2 / 2;
      return (n2 & 1) == 0 ? self.a(n - 1).add(self.a(n)) : self.a(n + 1).subtract(self.a(n));
    }, "0, 1");
  }
}
