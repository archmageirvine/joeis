package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

import java.util.Arrays;

/**
 * A003060.
 * @author Sean A. Irvine
 */
public class A003060 implements Sequence {

  private long mN = -1;
  private Z mTen = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mTen = mTen.multiply(10);
    final Z[] divisors = Cheetah.factor(mTen.subtract(1)).divisors();
    Arrays.sort(divisors);
    // skip 1 | 10^n-1
    for (int k = 1; k < divisors.length; ++k) {
      ZUtils.ord(divisors[k], Z.TEN);
      boolean ok = true;
      Z t = Z.ONE;
      for (int j = 1; j < mN; ++j) {
        t = t.multiply(10);
        if (t.subtract(1).mod(divisors[k]).equals(Z.ZERO)) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return divisors[k];
      }
    }
    throw new RuntimeException();
  }
}
