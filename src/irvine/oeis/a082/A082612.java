package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082612 Numbers n such that ((n-1)^2+1)/2 and n^2+1 and ((n+1)^2+1)/2 are prime if n is even or (n-1)^2+1 and (n^2+1)/2 and (n+1)^2+1 are prime if n is odd.
 * @author Sean A. Irvine
 */
public class A082612 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final Z z = Z.valueOf(n);
    if ((n & 1) == 0) {
      return z.square().add(1).isProbablePrime() && Z.valueOf(n - 1).square().add(1).divide2().isProbablePrime() && Z.valueOf(n + 1).square().add(1).divide2().isProbablePrime();
    } else {
      return z.square().add(1).divide2().isProbablePrime() && Z.valueOf(n - 1).square().add(1).isProbablePrime() && Z.valueOf(n + 1).square().add(1).isProbablePrime();
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
