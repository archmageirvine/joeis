package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078250 a(1) = 1, a(n) = smallest multiple of n using prime digits if n is composite else smallest multiple of n using composite digits, with a(n) = 0 if there are none.
 * @author Sean A. Irvine
 */
public class A078250 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (mN % 10 == 0 || mN % 625 == 0) {
      return Z.ZERO;
    }
    long t = mN;
    if (Predicates.PRIME.is(mN)) {
      while (true) {
        if ((Functions.SYNDROME.i(t) & 0b0010101110) == 0) {
          return Z.valueOf(t);
        }
        t += mN;
      }
    } else {
      while (true) {
        if ((Functions.SYNDROME.i(t) & 0b1101010011) == 0) {
          return Z.valueOf(t);
        }
        t += mN;
      }
    }
  }
}

