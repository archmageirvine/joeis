package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074157 Smallest multiple of n which uses no digits of n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A074157 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long r = ++mN % 10;
    if (r == 0) {
      return Z.ZERO;
    }
    final int syn = Functions.SYNDROME.i(mN);
    if (syn == 0b1111111111) {
      return Z.ZERO; // already pandigital
    }
    if (r == 5 && (syn & 1) == 1) {
      return Z.ZERO;
    }
    long m = mN;
    while (true) {
      m += mN;
      if ((Functions.SYNDROME.i(m) & syn) == 0) {
        return Z.valueOf(m);
      }
    }
  }
}
