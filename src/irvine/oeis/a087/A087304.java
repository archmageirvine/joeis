package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087304 Smallest nontrivial multiple of n whose nonzero digit product is the same as that of the nonzero digit product of n. By nontrivial one means a(n) is not equal to n or (10^k)*n. 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A087304 extends Sequence1 {

  private long mN = 0;

  private boolean is(long t, final Z s) {
    if (!Functions.DIGIT_NZ_PRODUCT.z(t).equals(s)) {
      return false;
    }
    while (t % 10 == 0) {
      t /= 10;
      if (t == mN) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final Z s = Functions.DIGIT_NZ_PRODUCT.z(++mN);
    long t = 2 * mN;
    while (!is(t, s)) {
      t += mN;
    }
    return Z.valueOf(t);
  }
}
