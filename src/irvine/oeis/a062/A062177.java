package irvine.oeis.a062;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062170.
 * @author Sean A. Irvine
 */
public class A062177 extends Sequence1 {

  // After Antti Karttunen Maple code

  private int mN = -1;
  private final ArrayList<Z> mA = new ArrayList<>();

  private List<Integer> maskees(final int n) {
    final ArrayList<Integer> a = new ArrayList<>();
    final List<Long> b = listMaskBits(n);
    final long u = (1L << b.size()) - 1;
    for (long i = 0; i <= u; ++i) {
      a.add(sumByMaskList(i, b));
    }
    return a;
  }

  private int sumByMaskList(final long nn, final List<Long> a) {
    long n = nn;
    int s = 0;
    int i = 0;
    while (n > 0) {
      if ((n & 1) == 1) {
        s += a.get(i);
      }
      n >>>= 1;
      ++i;
    }
    return s;
  }

  private List<Long> listMaskBits(final int nn) {
    final ArrayList<Long> a = new ArrayList<>();
    long x = 1;
    long n = nn;
    while (n > 0) {
      if ((n & 1) == 1) {
        a.add(x);
      }
      n >>>= 1;
      x <<= 1;
    }
    return a;
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Z.ONE);
    } else {
      ++mN;
      final List<Integer> m = maskees(mN);
      final int n = m.size();
      Z s = Z.ZERO;
      for (int j = 0; j < n; ++j) {
        s = s.add(mA.get(m.get(j)).multiply(mA.get(m.get(n - j - 1))));
      }
      mA.add(s);
    }
    return mA.get(mA.size() - 1);
  }
}
