package irvine.oeis.a338;
// Generated by gen_seq4.pl 2024-07-02/multrar at 2024-07-03 22:28

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A338293 Number of matchings in the complete binary tree of n rows.
 * @author Georg Fischer
 */
public class A338293 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A338293() {
    super(0, (self, n) -> self.a(n - 1).square().add(self.a(n - 1).multiply(2).multiply(self.a(n - 2).square())), "1, 1");
  }
}
