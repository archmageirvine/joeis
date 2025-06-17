package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078116 Primes of the form x^2 + 2y^2 where y&lt;=x. Terms are listed in increasing order of x; for fixed x they're in increasing order of y.
 * @author Sean A. Irvine
 */
public class A078116 extends Sequence1 {

  private long mX = 1;
  private long mY = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mY > mX) {
        ++mX;
        mY = 1;
      }
      final Z t = Z.valueOf(mX).square().add(Z.valueOf(mY).square().multiply2());
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

