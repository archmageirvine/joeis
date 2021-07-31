package irvine.oeis.a049;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049406 From a solution to the Prouhet-Tarry-Escott problem: 3^n + 5^n + 30^n + 57^n + 104^n + 116^n + 186^n + 198^n + 245^n + 272^n + 297^n + 299^n.
 * @author Sean A. Irvine
 */
public class A049406 implements Sequence {

  private static final long[] CONS = {3, 5, 30, 57, 104, 116, 186, 198, 245, 272, 297, 299};
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

