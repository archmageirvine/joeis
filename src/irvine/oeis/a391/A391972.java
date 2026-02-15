package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391972 a(n) = 1 if n=1 or a(n-1) is prime; a(n) = a(n-1) + i otherwise, where i = n - r and r is the number of occurrences of 1 among terms a(1) to a(n-1).
 * @author Sean A. Irvine
 */
public class A391972 extends Sequence1 {

  private long mOnes = 1;
  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (mA.isProbablePrime()) {
      ++mOnes;
      mA = Z.ONE;
    } else {
      mA = mA.add(mN - mOnes);
    }
    return mA;
  }
}
