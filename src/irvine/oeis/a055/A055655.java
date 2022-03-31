package irvine.oeis.a055;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055655 Efficient representation of n in "square base" where xyz means 9x+4y+z and z&lt;4, y&lt;9 and x&lt;16 etc.
 * @author Sean A. Irvine
 */
public class A055655 implements Sequence {

  // After M. F. Hasler

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    Z s = Z.ZERO;
    final List<Long> v = new ArrayList<>();
    v.add(3L);
    while (v.get(v.size() - 1) < m) {
      final int vs = v.size();
      v.add(v.get(v.size() - 1) + ((2L + vs) * (2L + vs) - 1) * (1L + vs) * (1L + vs));
    }
    for (int i = 1; i < v.size(); ++i) {
      final long d = v.size() - i + 1;
      final long d2 = d * d;
      final long t = Math.max((m - v.get(v.size() - i - 1) + d2 - 1) / d2, 0);
      s = s.multiply(10).add(t);
      m -= t * d2;
    }
    return s.multiply(10).add(m);
  }
}

