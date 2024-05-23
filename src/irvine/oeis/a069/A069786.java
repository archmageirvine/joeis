package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069786 Smallest k&gt;n such that C(n+3,n)=A000332(n) divides A000332(k).
 * @author Sean A. Irvine
 */
public class A069786 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mN).multiply(mN + 1).multiply(mN + 2).multiply(mN + 3);
    long k = mN;
    while (true) {
      final Z u = Z.valueOf(++k).multiply(k + 1).multiply(k + 2).multiply(k + 3);
      if (u.mod(t).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
