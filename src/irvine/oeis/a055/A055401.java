package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055401 Number of positive cubes needed to sum to n using the greedy algorithm.
 * @author Sean A. Irvine
 */
public class A055401 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (m != 0) {
      m -= Math.pow(Math.floor(Math.cbrt(m)), 3);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
