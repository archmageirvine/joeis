package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070287.
 * @author Sean A. Irvine
 */
public class A070304 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN * mN);
    long cnt = 0;
    for (long k = 0; k < mN * mN; ++k) {
      if (n.multiply(k * k).mod(mN * mN + k * k) == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
