package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061986 Number of times n appears in sequence b(k) = 1 + b(floor(k/2)) + b(floor(k/3)) with b(0) = 0, i.e., in A061984.
 * @author Sean A. Irvine
 */
public class A061986 extends A061984 {

  private Z mN = Z.NEG_ONE;
  private Z mA = super.next();

  @Override
  public Z next() {
    mN = mN.add(1);
    long cnt = 0;
    while (mA.equals(mN)) {
      ++cnt;
      mA = super.next();
    }
    return Z.valueOf(cnt);
  }
}
