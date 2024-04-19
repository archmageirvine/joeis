package irvine.oeis.a341;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a112.A112539;

/**
 * A341389 Characteristic function of A158705, nonnegative integers with an odd number of even powers of 2 in their base-2 representation.
 * @author Georg Fischer
 */
public class A341389 extends Sequence0 {

  private final int mN = -1;
  private final A112539 mSeq = new A112539();

  @Override
  public Z next() {
    return mSeq.next().isZero() ? Z.ONE : Z.ZERO;
  }
}
