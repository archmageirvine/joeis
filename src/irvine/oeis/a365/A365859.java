package irvine.oeis.a365;
// Generated by gen_seq4.pl 2025-06-16.ack/multraf at 2025-06-16 21:55

import irvine.math.z.Z;
import irvine.oeis.a032.A032198;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A365859 Number of self-dual cyclic n-color compositions.
 * @author Georg Fischer
 */
public class A365859 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A365859() {
    super(1, (self, n) -> Z.TWO.multiply(self.s(0)).subtract(self.s(1)), "", new A365857(), new A032198());
  }
}
