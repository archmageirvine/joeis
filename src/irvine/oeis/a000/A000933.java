package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000933.
 * @author Sean A. Irvine
 */
public class A000933 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ZERO;
    }
    return Z.valueOf(mN - 3).multiply(mN - 4).add(11).divide(12);
  }
}
