package irvine.oeis.a193;
// manually 2023-12-27/dirtraf at 2023-12-27 13:44

import irvine.math.z.Z;
import irvine.oeis.a000.A000593;
import irvine.oeis.a008.A008472;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A193529 Sum of odd divisors of sopf(n).
 * @author Georg Fischer
 */
public class A193529 extends DirectTransformSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A193529() {
    super(1, new A000593(), new A008472());
  }

  @Override
  public Z next() {
    final Z result = super.next();
    return (++mN == 1) ? Z.ZERO : result;
  }
}
