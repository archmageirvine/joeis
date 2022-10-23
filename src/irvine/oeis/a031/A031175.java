package irvine.oeis.a031;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A031175 Shortest edge c of (measured by the longest edge) primitive Euler bricks (a, b, c, sqrt(a^2 + b^2), sqrt(b^2 + c^2), sqrt(a^2 + c^2) are integers).
 * @author Sean A. Irvine
 */
public class A031175 extends Sequence1 {

  private final TreeSet<Z> mC = new TreeSet<>();
  private long mN = 239;

  @Override
  public Z next() {
    while (mC.isEmpty()) {
      ++mN;
      final Z n2 = Z.valueOf(mN).square();
      for (long b = 1; b < mN; ++b) {
        final long d = LongUtils.gcd(b, mN);
        final Z b2 = Z.valueOf(b).square();
        if (n2.add(b2).isSquare()) {
          for (long c = 1; c <= b; ++c) {
            if (LongUtils.gcd(c, d) == 1) {
              final Z c2 = Z.valueOf(c).square();
              if (n2.add(c2).isSquare() && b2.add(c2).isSquare()) {
                mC.add(Z.valueOf(c));
              }
            }
          }
        }
      }
    }
    return mC.pollFirst();
  }
}
