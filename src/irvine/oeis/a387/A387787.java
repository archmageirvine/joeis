package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387787 allocated for Aied Sulaiman.
 * @author Sean A. Irvine
 */
public class A387787 extends Sequence1 {

  private long mN = 2;

  private boolean is(final long n) {
    Z x = Z.valueOf(n);
    while (true) {
      x = Functions.COLLATZ.z(x);
      if (x.compareTo(n) < 0) {
        return x.isProbablePrime();
      }
    }
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
