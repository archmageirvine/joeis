package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072140.
 * @author Sean A. Irvine
 */
public class A072179 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).pow(mN + 1).subtract(Z.valueOf(mN + 1).pow(mN)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
