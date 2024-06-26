package irvine.oeis.a361;
// Generated by gen_seq4.pl 2024-05-26/multrar at 2024-05-27 00:43

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A361735 Modified semi-Padovan sequence: a(2*n) = a(n) and a(2*n+1) = a(2*n-1) + a(2*n-2), with a(0) = 0 and a(1) = 1.
 * @author Georg Fischer
 */
public class A361735 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A361735() {
    super(0, (self, n2) -> {
      final int n = n2 / 2;
      return (n2 & 1) == 0 ? self.a(n) : self.a(n * 2 - 1).add(self.a(n * 2 - 2));
    }, "0, 1");
  }
}
