package irvine.oeis.a087;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087412 a(n) is the number of solutions to x^3 + y^3 == 1 (mod n).
 * @author Sean A. Irvine
 */
public class A087412 extends Sequence1 {

  // After Andrew Howroyd

  private int mN = 0;

  @Override
  public Z next() {
    final long[] v = new long[++mN + 1];
    for (int k = 0; k < mN; ++k) {
      ++v[IntegerUtils.modPow(k, 3, mN)];
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(v[k] * v[(mN + 1 - k) % mN]);
    }
    return sum;
  }
}

