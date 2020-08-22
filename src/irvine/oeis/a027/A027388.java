package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027388 Write digits for n, count endpoints (version 3).
 * @author Sean A. Irvine
 */
public class A027388 implements Sequence {

  private static final int[] ENDPOINTS = {0, 2, 2, 2, 2, 2, 1, 4, 0, 1};
  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    int sum = 0;
    while (m != 0) {
      sum += ENDPOINTS[(int) (m % 10)];
      m /= 10;
    }
    return Z.valueOf(sum);
  }
}
