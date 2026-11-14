package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399911.
 * @author Sean A. Irvine
 */
public class A087372 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 3 == 0) {
      return Z.ZERO;
    }
    long k = 0;
    Z t = Z.ONE;
    while (true) {
      ++k;
      t = t.multiply(3);
      if (t.add(2 * mN).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
