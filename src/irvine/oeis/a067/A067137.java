package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A067137 a(n) is the smallest number m such that n^(1/m) = 1.(leading zeros)n...
 * @author Sean A. Irvine
 */
public class A067137 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final CR z = CR.valueOf(++mN);
    long k = 1;
    while (true) {
      CR t = z.pow(new Q(1, ++k)).subtract(1);
      if (t.floor().isZero()) {
        while (t.compareTo(z) < 0) {
          t = t.multiply(10);
        }
        if (t.floor().longValue() == mN) {
          return Z.valueOf(k);
        }
      }
    }
  }
}
