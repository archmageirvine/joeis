package irvine.oeis.a195;
// manually 2023-12-27/dirtraf at 2023-12-27 13:44

import irvine.math.z.Z;
import irvine.oeis.a000.A000166;
import irvine.oeis.a000.A000593;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A195210 Sum of odd divisors of !n.
 * @author Georg Fischer
 */
public class A195210 extends DirectTransformSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A195210() {
    super(0, new A000593(), new A000166());
  }

  @Override
  public Z next() {
    final Z result = super.next();
    return (++mN == 1) ? Z.ZERO : result;
  }
}
