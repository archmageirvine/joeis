package irvine.oeis.a342;
// Generated by gen_seq4.pl 2024-04-17/multraf at 2024-04-17 19:29

import irvine.math.z.Z;
import irvine.oeis.a030.A030101;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A342123 a(n) is the remainder when n is divided by its binary reverse.
 * @author Georg Fischer
 */
public class A342123 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A342123() {
    super(1, (self, n) -> Z.valueOf(n).mod(self.s(0)), "", new A030101());
  }
}
