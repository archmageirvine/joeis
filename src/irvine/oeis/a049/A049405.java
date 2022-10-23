package irvine.oeis.a049;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049405 From a solution to the Prouhet-Tarry-Escott problem: 0^n + 11^n + 24^n + 65^n + 90^n + 129^n + 173^n + 212^n + 237^n + 278^n + 291^n + 302^n.
 * @author Sean A. Irvine
 */
public class A049405 extends Sequence0 {

  private static final long[] CONS = {0, 11, 24, 65, 90, 129, 173, 212, 237, 278, 291, 302};
  private final Z[] mA = new Z[CONS.length];

  @Override
  public Z next() {
    if (mA[0] == null) {
      Arrays.fill(mA, Z.ONE);
      return Z.valueOf(mA.length);
    } else {
      Z sum = Z.ZERO;
      for (int k = 0; k < mA.length; ++k) {
        mA[k] = mA[k].multiply(CONS[k]);
        sum = sum.add(mA[k]);
      }
      return sum;
    }
  }
}

