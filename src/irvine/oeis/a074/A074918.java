package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074918 Highly imperfect numbers: n sets a record for the value of abs(sigma(n)-2*n) (absolute value of A033879).
 * @author Sean A. Irvine
 */
public class A074918 extends Sequence1 {

  private Z mA = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z d = Functions.SIGMA1.z(++mN).subtract(2L * mN).abs();
      if (d.compareTo(mA) > 0) {
        mA = d;
        return Z.valueOf(mN);
      }
    }
  }
}
