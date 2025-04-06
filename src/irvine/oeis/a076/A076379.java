package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076379 Numbers k such that k!-x!+1 is never prime for x&lt;k.
 * @author Sean A. Irvine
 */
public class A076379 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final Z f = Functions.FACTORIAL.z(n).add(1);
    for (long k = n - 1; k > 0; --k) {
      if (f.subtract(Functions.FACTORIAL.z(k)).isProbablePrime()) {
        return false;
      }
    }
    return true;
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
