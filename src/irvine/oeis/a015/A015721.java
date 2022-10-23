package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015721 Composite and even n such that phi(n) * sigma(n) is one less than a square.
 * @author Sean A. Irvine
 */
public class A015721 extends Sequence1 {

  private Z mN = Z.FOUR;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (A015709.is(mN)) {
        return mN;
      }
    }
  }
}
