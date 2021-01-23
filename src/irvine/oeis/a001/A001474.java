package irvine.oeis.a001;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001474 w such that w^3+x^3+y^3+z^3=0, w&gt;|x|&gt;|y|&gt;|z|, is soluble.
 * @author Sean A. Irvine
 */
public class A001474 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final Z n3 = Z.valueOf(++mN).pow(3);
      for (long x = -mN + 1; x <= -1; ++x) {
        final long dx = LongUtils.gcd(mN, x);
        final Z x3 = n3.add(Z.valueOf(x).pow(3));
        for (long y = x + 1; y <= -1; ++y) {
          final long dy = LongUtils.gcd(dx, y);
          final Z y3 = x3.add(Z.valueOf(y).pow(3));
          for (long z = y + 1; z <= -y - 1; ++z) {
            if (Math.abs(LongUtils.gcd(dy, z)) == 1 && y3.add(Z.valueOf(z).pow(3)).isZero()) {
              return Z.valueOf(mN);
            }
          }
        }
      }
    }
  }
}
