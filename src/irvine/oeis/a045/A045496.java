package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045496.
 * @author Sean A. Irvine
 */
public class A045496 implements Sequence {

  private long[] SMALL = {1, 1, 3, 1, 20, 24, 63, 288};
  private int mN = 0;

  @Override
  public Z next() {
    if (mN < SMALL.length) {
      return Z.valueOf(SMALL[mN++]);
    }
    return Z.ONE;
  }
}
