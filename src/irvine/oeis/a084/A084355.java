package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084355 Least number of positive cubes needed to represent n!.
 * @author Sean A. Irvine
 */
public class A084355 extends Sequence0 {

  // After Herman Jamke

  private long mN = -1;

  private boolean is(final Z n, final Z hi, final Z lo, final long k) {
    if (k == 1) {
      return n.equals(Functions.CBRT.z(n).pow(3));
    }
    for (Z i = hi; i.compareTo(lo) >= 0; i = i.subtract(1)) {
      final Z m = n.subtract(i.pow(3));
      if (is(m, i.min(Functions.CBRT.z(m)), Functions.CEIL_CBRT.z(m.divide(k - 1)), k - 1)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    final Z f = Functions.FACTORIAL.z(++mN);
    long k = 0;
    while (true) {
      ++k;
      if (is(f, Functions.CBRT.z(f), Functions.CEIL_CBRT.z(f.divide(k)), k)) {
        return Z.valueOf(k);
      }
    }
  }

}
