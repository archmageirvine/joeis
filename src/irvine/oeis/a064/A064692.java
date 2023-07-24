package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064692 Total number of holes in decimal expansion of the number n, assuming 4 has 1 hole.
 * @author Sean A. Irvine
 */
public class A064692 extends Sequence0 {

  private static final long[] HOLES = {1, 0, 0, 0, 1, 0, 1, 0, 2, 1};
  private long mN = -1;

  @Override
  public Z next() {
    long cnt = 0;
    long m = ++mN;
    do {
      cnt += HOLES[(int) (m % 10)];
      m /= 10;
    } while (m != 0);
    return Z.valueOf(cnt);
  }
}
