package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068487 Smallest prime equal to n^2 + m^2 with n&lt;m.
 * @author Sean A. Irvine
 */
public class A068487 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n2 = Z.valueOf(++mN).square();
    long m = mN;
    while (true) {
      final Z t = n2.add(Z.valueOf(++m).square());
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

