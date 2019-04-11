package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000035 Period 2: repeat <code>[0, 1]</code>; <code>a(n) = n mod 2</code>; parity of n.
 * @author Sean A. Irvine
 */
public class A000035 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return (mN++ & 1) == 0 ? Z.ZERO : Z.ONE;
  }
}

