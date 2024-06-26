package irvine.oeis.a243;
// Generated by gen_seq4.pl 2024-05-17/multrar at 2024-05-17 23:03

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A243005 a(n) = (a(n-1) - a(n-2)) * a(n-1) / a(n-3) with a(0) = 2, a(1) = 1, a(2) = -1.
 * @author Georg Fischer
 */
public class A243005 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A243005() {
    super(0, (self, n) -> self.a(n - 1).multiply(self.a(n - 1).subtract(self.a(n - 2))).divide(self.a(n - 3)), "2, 1, -1");
  }
}
