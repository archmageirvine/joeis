package irvine.oeis.a006;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006606 Nonperiodic autocorrelation functions of length n.
 * @author Sean A. Irvine
 */
public class A006606 extends Sequence1 {

  private final TreeSet<short[]> mUnique = new TreeSet<>((a, b) -> {
    assert a.length == b.length;
    for (int k = 0; k < a.length; ++k) {
      final int c = Short.compare(a[k], b[k]);
      if (c != 0) {
        return c;
      }
    }
    return 0;
  });
  private int mN = 0;

  private int bit(final long a, final int k) {
    return -1 + (int) (((a >>> k) & 1) << 1);
  }

  private int npaf(final int n, final int k, final long a) {
    int s = 0;
    for (int i = 0; i <= n - k - 1; ++i) {
      s += bit(a, i) * bit(a, i + k);
    }
    return s;
  }

  private short[] npaf(final int n, final long a) {
    final short[] npaf = new short[n - 1];
    for (int k = 1; k < n; ++k) {
      npaf[k - 1] = (short) npaf(n, k, a);
    }
    return npaf;
  }

  @Override
  public Z next() {
    ++mN;
    mUnique.clear();
    final long limit = 1L << mN;
    for (long a = 0; a < limit; ++a) {
      mUnique.add(npaf(mN, a));
    }
    return Z.valueOf(mUnique.size());
  }
}

