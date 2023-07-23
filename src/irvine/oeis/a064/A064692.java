package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064691.
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
