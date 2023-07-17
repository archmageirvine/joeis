package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064531 Number of connected components remaining when decimal expansion of the number n is cut from a piece of paper.
 * @author Sean A. Irvine
 */
public class A064531 extends Sequence0 {

  private static final long[] PIECES = {2, 1, 1, 1, 1, 1, 2, 1, 3, 2};
  private long mN = -1;

  @Override
  public Z next() {
    long t = ++mN;
    long s = 1;
    do {
      s += PIECES[(int) (t % 10)] - 1;
      t /= 10;
    } while (t != 0);
    return Z.valueOf(s);
  }
}

