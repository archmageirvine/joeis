package irvine.oeis.a074;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A074918 Highly imperfect numbers: n sets a record for the value of abs(sigma(n)-2*n) (absolute value of A033879).
 * @author Sean A. Irvine
 */
public class A074918 implements Sequence {

  private Z mA = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z d = Cheetah.factor(++mN).sigma().subtract(2L * mN).abs();
      if (d.compareTo(mA) > 0) {
        mA = d;
        return Z.valueOf(mN);
      }
    }
  }
}
