package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023185 Square of main diagonal of 3-dimensional box with coprime integer sides and integer face diagonals.
 * @author Sean A. Irvine
 */
public class A023185 extends Sequence1 {

  // Straight forward search.  Does not even use know results like
  // two of the sides must be even, two sides must be divisible by 3.
  // Possibly the initial search bound (on mC^2) could be weaker as well.

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mC = 239;

  @Override
  public Z next() {
    while (mA.isEmpty() || Z.valueOf(mC).square().compareTo(mA.first()) < 0) {
      final Z c2 = Z.valueOf(++mC).square();
      for (long b = 1; b <= mC; ++b) {
        final Z b2 = Z.valueOf(b).square();
        final Z b2c2 = c2.add(b2);
        b2c2.sqrt();
        if (b2c2.auxiliary() == 1) {
          for (long a = 1; a <= b; ++a) {
            if (LongUtils.gcd(a, b, mC) == 1) {
              final Z a2 = Z.valueOf(a).square();
              final Z a2c2 = c2.add(a2);
              a2c2.sqrt();
              if (a2c2.auxiliary() == 1) {
                final Z a2b2 = b2.add(a2);
                a2b2.sqrt();
                if (a2b2.auxiliary() == 1) {
                  mA.add(a2.add(b2).add(c2));
                }
              }
            }
          }
        }
      }
    }
    return mA.pollFirst();
  }
}

