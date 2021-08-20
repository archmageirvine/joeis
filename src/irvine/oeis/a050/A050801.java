package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050801 Numbers k such that k^2 is expressible as the sum of two positive cubes in at least one way.
 * @author Sean A. Irvine
 */
public class A050801 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).square();
      for (long x = 1; true; ++x) {
        final Z x3 = Z.valueOf(x).pow(3);
        final Z y3 = t.subtract(x3);
        if (y3.compareTo(x3) < 0) {
          break;
        }
        y3.root(3);
        if (y3.auxiliary() == 1) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

