package irvine.oeis.a193;
// manually 2023-12-27/dirtraf at 2023-12-27 13:44

import irvine.math.z.Z;
import irvine.oeis.a000.A000593;
import irvine.oeis.a001.A001222;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A193512 a(n) = Sum of odd divisors of Omega(n), a(1) = 0.
 * @author Georg Fischer
 */
public class A193512 extends DirectTransformSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A193512() {
    super(1, new A000593(), new A001222());
  }

  @Override
  public Z next() {
    final Z result = super.next();
    return (++mN == 1) ? Z.ZERO : result;
  }
}
