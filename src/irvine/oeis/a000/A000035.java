package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000035 Period <code>2</code>: repeat <code>[0, 1]; a(n) = n mod 2</code>; parity of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A000035 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return (mN++ & 1) == 0 ? Z.ZERO : Z.ONE;
  }
}

