package irvine.oeis.a343;
// Generated by gen_seq4.pl 2024-05-09/multraf at 2024-05-09 22:36

import irvine.oeis.a006.A006746;
import irvine.oeis.a056.A056877;
import irvine.oeis.a142.A142886;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A343562 The number of n-cell polyominoes with a line of symmetry parallel to the edges.
 * @author Georg Fischer
 */
public class A343562 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A343562() {
    super(1, (self, n) -> self.s(0).add(self.s(1)).add(self.s(2)), "", new A056877(), new A142886(), new A006746());
  }
}
