package irvine.oeis.a118;
// Generated by gen_seq4.pl 2024-07-12/multrar at 2024-07-12 23:14

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A118196 Column 0 of the matrix inverse of triangle A117401(n,k) = (2^k)^(n-k).
 * @author Georg Fischer
 */
public class A118196 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A118196() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, n - 1, j -> Z.TWO.pow((long) j * (n - j)).multiply(self.a(j))).negate(), "1, -1");
  }
}
