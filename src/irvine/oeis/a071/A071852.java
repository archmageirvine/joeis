package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071852 Smallest k such that 2^k + 1 has exactly n distinct prime factors.
 * @author Sean A. Irvine
 */
public class A071852 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Functions.OMEGA.i(Z.ONE.shiftLeft(++k).add(1)) == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
