package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081942.
 * @author Sean A. Irvine
 */
public class A081944 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN);
      if (t.multiply(mN - 1).subtract(1).isProbablePrime() && t.multiply(mN + 1).subtract(1).isProbablePrime()) {
        return t;
      }
    }
  }
}
