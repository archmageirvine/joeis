package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078249 Smallest multiple of n using all the digits other than used by n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A078249 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 10 == 0) {
      return Z.ZERO;
    }
    final int syn = Functions.SYNDROME.i(mN);
    if (syn == 0b1111111111 || syn == 0b0101010101) {
      return Z.ZERO;
    }
    if ((syn & 1) == 1 && mN % 10 == 5) {
      return Z.ZERO;
    }
    final int target = ~syn & 0b1111111111;
    long k = mN;
    while (true) {
      k += mN;
      if (Functions.SYNDROME.i(k) == target) {
        return Z.valueOf(k);
      }
    }
  }
}

