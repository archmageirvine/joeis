package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061398.
 * @author Sean A. Irvine
 */
public class A068404 extends Sequence1 {

  private long mN = 27719;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma().compareTo(Z.valueOf(4 * mN)) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
