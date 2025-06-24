package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078239 a(n) = smallest multiple of n using only prime digits, with a(n) = 0 if there are none.
 * @author Sean A. Irvine
 */
public class A078239 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 10 == 0 || mN % 625 == 0) {
      return Z.ZERO;
    }
    long t = mN;
    while (true) {
      if ((Functions.SYNDROME.i(t) & 0b1101010011) == 0) {
        return Z.valueOf(t);
      }
      t += mN;
    }
  }
}

