package irvine.oeis.a084;
// Generated by gen_seq4.pl 2024-05-14/multrar at 2024-05-14 21:53

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A084765 a(n) = 2*a(n-1)^2 - 1, a(0)=1, a(1)=5.
 * @author Georg Fischer
 */
public class A084765 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A084765() {
    super(0, (self, n) -> self.a(n - 1).square().multiply(2).subtract(1), "1, 5");
  }
}
