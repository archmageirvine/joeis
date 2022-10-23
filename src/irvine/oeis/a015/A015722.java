package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015722 Odd composite n such that phi(n) * sigma(n) is one less than a square.
 * @author Sean A. Irvine
 */
public class A015722 extends Sequence1 {

  private Z mN = Z.valueOf(31);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mN.isProbablePrime() && A015709.is(mN)) {
        return mN;
      }
    }
  }
}
