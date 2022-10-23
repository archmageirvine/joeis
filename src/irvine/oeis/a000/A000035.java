package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000035 Period 2: repeat [0, 1]; a(n) = n mod 2; parity of n.
 * @author Sean A. Irvine
 */
public class A000035 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return (++mN & 1) == 0 ? Z.ZERO : Z.ONE;
  }
}

