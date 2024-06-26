package irvine.oeis.a228;
// Generated by gen_seq4.pl 2024-05-26/multrar at 2024-05-27 00:43

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A228451 Recurrence: a(2n) = a(n), a(2n+1) = a(n) + 2n + 1, with a(0) = 0, a(1) = 1.
 * @author Georg Fischer
 */
public class A228451 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A228451() {
    super(0, (self, n2) -> {
      final int n = n2 / 2;
      return (n2 & 1) == 0 ? self.a(n) : self.a(n).add(2 * n + 1);
    }, "0, 1");
  }
}
