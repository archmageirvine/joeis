package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000035 Period 2: repeat [0, 1]; a(n) = n mod 2; parity of n.
 * @author Sean A. Irvine
 */
public class A000035 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z next() {
    return (++mN & 1) == 0 ? Z.ZERO : Z.ONE;
  }

  @Override
  public Z a(final Z n) {
    return n.testBit(0) ? Z.ONE : Z.ZERO;
  }

  @Override
  public Z a(final int n) {
    return (n & 1) == 0 ? Z.ZERO : Z.ONE;
  }

}

