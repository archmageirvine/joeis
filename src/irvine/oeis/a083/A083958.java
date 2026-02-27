package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083958 Smallest multiple of n using all digits of (n-1) at least once and no others; or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A083958 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final int syn = Functions.SYNDROME.i(mN++);
    if (mN == 1 || (syn & 0b0101010101) == 0) {
      return Z.ZERO;
    }
    if (mN % 5 != 0 && (syn & 0b0101010101) != 0) {
      long m = mN;
      while (true) {
        if (Functions.SYNDROME.i(m) == syn) {
          return Z.valueOf(m);
        }
        m += mN;
      }
    }
    return Z.ZERO;
  }
}
