package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006971 Composite numbers k such that <code>k == +-1 (mod 8)</code> and <code>2^((k-1)/2) == 1 (mod k)</code>.
 * @author Sean A. Irvine
 */
public class A006971 implements Sequence {

  private Z mN = Z.valueOf(559);
  private long mD = 2;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(mD);
      mD = 8 - mD; // 2, 6, 2, 6, yields values = +/- 1 mod 8
      if (!mN.isProbablePrime() && Z.ONE.equals(Z.TWO.modPow(mN.subtract(1).divide2(), mN))) {
        return mN;
      }
    }
  }
}
