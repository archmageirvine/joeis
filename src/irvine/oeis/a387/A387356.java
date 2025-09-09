package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387356 allocated for Paolo Xausa.
 * @author Sean A. Irvine
 */
public class A387356 extends Sequence1 {

  private long mN = 0;

  private boolean is(long n) {
    long gcd = n;
    final String s = Long.toString(n);
    for (int k = 1; k <= s.length(); ++k) {
      gcd = Functions.GCD.l(gcd, Long.parseLong(s.substring(k) + s.substring(0, k)));
      if (gcd == 1) {
        return true;
      }
    }
    return gcd == 1;
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

