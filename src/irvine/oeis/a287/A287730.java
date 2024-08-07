package irvine.oeis.a287;
// Generated by gen_seq4.pl 2024-08-04/multrar at 2024-08-04 18:23

import irvine.oeis.DirectSequence;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A287730 The s-fusc function s(n) = a(n): a(1) = 0, a(2n) = A287729(n), a(2n+1) = A287729(n) + A287729(n+1).
 * @author Georg Fischer
 */
public class A287730 extends MultiTransformSequence {

  private static final DirectSequence A287729 = new A287729();

  /** Construct the sequence. */
  public A287730() {
    super(1, (self, n) -> {
      final int h = n / 2;
      return ((n & 1) == 0) ? A287729.a(h) : A287729.a(h).add(A287729.a(h + 1));
    }, "0");
  }
}
