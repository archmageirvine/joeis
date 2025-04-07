package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076495 Smallest x such that sigma(x) mod x = n, or 0 if no such x exists.
 * @author Sean A. Irvine
 */
public class A076495 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 5) {
      return Z.ZERO; // Conjectural
    }
    long k = 1;
    while (true) {
      if (Functions.SIGMA1.z(++k).mod(k) == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
