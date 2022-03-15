package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a000.A000043;

/**
 * A055166 Number of Mersenne prime exponents between 10^n and 10^(n+1).
 * @author Sean A. Irvine
 */
public class A055166 extends A000043 {

  private long mLimit = 1;

  @Override
  public Z next() {
    long cnt = mLimit == 1 ? 0 : 1;
    mLimit *= 10;
    while (super.next().longValueExact() < mLimit) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
