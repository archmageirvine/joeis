package irvine.oeis.a257;
// Generated by gen_seq4.pl 2024-05-09/multraf at 2024-05-09 22:36

import irvine.oeis.a060.A060130;
import irvine.oeis.a084.A084558;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A257510 Number of nonleading zeros in factorial base representation of n (A007623).
 * @author Georg Fischer
 */
public class A257510 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A257510() {
    super(1, (self, n) -> self.s(0).subtract(self.s(1)), "", new A084558(), new A060130());
  }
}
