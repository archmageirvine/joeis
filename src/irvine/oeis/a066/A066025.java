package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065964.
 * @author Sean A. Irvine
 */
public class A066025 extends Sequence1 {

  private long mN = 3;
  private Z mS = Z.FOUR;

  @Override
  public Z next() {
    while (true) {
      final Z t = mS;
      final Z n = Z.valueOf(mN);
      mS = Jaguar.factor(++mN).sigma();
      if (t.gcd(mS).compareTo(n) > 0) {
        return n;
      }
    }
  }
}
