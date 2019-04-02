package irvine.oeis.a090;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A090466 Regular figurative or polygonal numbers of order greater than 2.
 * @author Sean A. Irvine
 */
public class A090466 implements Sequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  private int mN = 3;

  @Override
  public Z next() {
    while (true) {
      final Z r = mPriority.isEmpty() ? null : mPriority.first();
      final Z h = Z.valueOf(mN).multiply(mN + 1).divide(2);
      final Z y = Z.valueOf(mN - 1).multiply(3);
      if (r == null || h.compareTo(r) <= 0 || y.compareTo(r) <= 0) {
        final Z o = Z.valueOf(mN - 1);
        final Z s = Z.ONE.subtract(o.square());
        final Z u = o.multiply(mN).divide(2);
        // Extend n
        for (long k = 3; k <= mN; ++k) {
          final Z t = s.add(u.multiply(k));
          mPriority.add(t);
        }
        // Extend k
        for (long n = 3; n < mN; ++n) {
          final Z g = Z.valueOf(n - 1);
          final Z t = Z.ONE.add(g.multiply(n).multiply(mN).divide(2)).subtract(g.square());
          mPriority.add(t);
        }
        ++mN;
      } else {
        break;
      }
    }
    return mPriority.pollFirst();
  }
}
