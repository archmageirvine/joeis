package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-06-13/multraf at 2024-06-14 00:04

import irvine.math.z.Z;
import irvine.oeis.a001.A001414;
import irvine.oeis.a059.A059975;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A373472 a(n) = 1 if A001414(n) and A059975(n) are both multiples of 3, otherwise 0, where A001414 and A059975 are fully additive with a(p) = p and a(p) = p-1, respectively.
 * @author Georg Fischer
 */
public class A373472 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A373472() {
    super(1, (self, n) -> self.s(0).mod(3) == 0 && self.s(1).mod(3) == 0 ? Z.ONE : Z.ZERO, "", new A001414(), new A059975());
  }
}
