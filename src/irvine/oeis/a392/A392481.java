package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392481 Numbers k such that both (3*k-3)^2 + k^2 and (3*k)^2 + (k+1)^2 are prime.
 * @author Sean A. Irvine
 */
public class A392481 extends Sequence1 {

  private long mN = 9;

  private boolean is(final long n) {
    return Z.valueOf(3 * n - 3).square().add(Z.valueOf(n).square()).isProbablePrime()
      && Z.valueOf(3 * n).square().add(Z.valueOf(n + 1).square()).isProbablePrime();
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
