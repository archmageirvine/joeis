package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078415 Let f(n) = fraction of digits that are nonzero when n is written in base 2 and g(n) the same fraction for base 3. Let h(n) = max {f(n), g(n)}. Sequence gives n for which h(n) sets a new low record.
 * @author Sean A. Irvine
 */
public class A078415 extends Sequence1 {

  private long mN = 0;
  private long mP = Long.MAX_VALUE;
  private long mQ = 1;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      int nz2 = 0;
      int l2 = 0;
      while (m != 0) {
        ++l2;
        if ((m & 1) != 0) {
          ++nz2;
        }
        m >>>= 1;
      }
      int nz3 = 0;
      int l3 = 0;
      m = mN;
      while (m != 0) {
        ++l3;
        if (m % 3 != 0) {
          ++nz3;
        }
        m /= 3;
      }
      final long bnz;
      final long bl;
      if (l3 * nz2 > l2 * nz3) {
        bnz = nz2;
        bl = l2;
      } else {
        bnz = nz3;
        bl = l3;
      }
      if (mQ * bnz < bl * mP) {
        mP = bnz;
        mQ = bl;
        return Z.valueOf(mN);
      }
    }
  }
}

