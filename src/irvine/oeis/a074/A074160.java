package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074160 Smallest multiple of n (&gt;n) using all prime digits; or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A074160 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long r = ++mN % 10;
    if (r == 0 || mN % 625 == 0) {
      return Z.ZERO;
    }
    final int syn = Functions.SYNDROME.i(mN);
    if (r == 5 && (syn & 1) == 1) {
      return Z.ZERO;
    }
    long m = mN;
    while (true) {
      m += mN;
      if ((Functions.SYNDROME.i(m) & 0b1101010011) == 0) {
        return Z.valueOf(m);
      }
    }
  }
}
