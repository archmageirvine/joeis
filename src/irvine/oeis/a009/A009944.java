package irvine.oeis.a009;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A009944 Left-right/right-left numbers: n = pq such that n=q_reversed*p_reversed.
 * @author Sean A. Irvine
 */
public class A009944 extends Sequence1 {

  private long mN = 125;

  @Override
  public Z next() {
    while (true) {
      long q = 0;
      long p = ++mN;
      while (p != 0) {
        q *= 10;
        q += p % 10;
        p /= 10;
        // q is already constructed in reverse
        if (Functions.REVERSE.l(p) * q == mN) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
