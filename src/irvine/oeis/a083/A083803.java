package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083799 Main diagonal of A083798.
 * @author Sean A. Irvine
 */
public class A083803 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 5 == 3) {
      return Z.ZERO;
    }
    final String s = String.valueOf(2 * mN - 1);
    long k = 0;
    while (true) {
      ++k;
      if (new Z(k + s).isProbablePrime() && new Z(s + k).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
