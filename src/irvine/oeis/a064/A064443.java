package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064443 Numbers k such that usigma(k) is a square and sets a new record for such squares.
 * @author Sean A. Irvine
 */
public class A064443 extends Sequence1 {

  private long mN = 0;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z u = Jaguar.factor(++mN).unitarySigma();
      if (u.compareTo(mS)> 0 && u.isSquare()) {
        mS = u;
        return Z.valueOf(mN);
      }
    }
  }
}
