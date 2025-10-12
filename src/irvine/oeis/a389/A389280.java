package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389280 allocated for Alex Ratushnyak.
 * @author Sean A. Irvine
 */
public class A389280 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long t = Functions.TRIANGULAR.l(++mN);
    long k = 0;
    while (true) {
      if (Z.valueOf(++k).pow(mN).bitCount() >= t * Long.bitCount(k)) {
        return Z.valueOf(k);
      }
    }
  }
}
