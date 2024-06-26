package irvine.oeis.a092;
// Generated by gen_seq4.pl 2024-06-14/multrar at 2024-06-14 23:07

import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A092483 a(n) is the floor of the average of the 1st moment of all previous entries.
 * @author Georg Fischer
 */
public class A092483 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A092483() {
    super(1, (self, n) -> Integers.SINGLETON.sum(1, n - 1, j -> self.a(j).multiply(j)).divide(n - 1), "1, 1, 1, 2, 3, 5");
  }
}
