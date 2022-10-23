package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027386 Write digits for n, count endpoints (version 1).
 * @author Sean A. Irvine
 */
public class A027386 extends Sequence0 {

  private static final int[] ENDPOINTS = {0, 2, 2, 2, 2, 2, 1, 2, 0, 1};
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
