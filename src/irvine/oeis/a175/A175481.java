package irvine.oeis.a175;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A175481.
 * @author Sean A. Irvine
 */
public class A175481 extends MemorySequence {

  private int mN = -1;

  private long bb(final long a, final long b) {
    assert b >= a;
    if (a == b) {
      return a;
    }
    final String sa = Long.toBinaryString(a);
    final String sb = Long.toBinaryString(b);
    for (long k = a; k > 0; --k) {
      final String sk = Long.toBinaryString(k);
      if (sa.contains(sk) && sb.contains(sk)) {
        return k;
      }
    }
    return 0;
  }

  private long b(final long a, final long b) {
    return a < b ? bb(a, b) : bb(b, a);
  }

  @Override
  protected Z computeNext() {
    long s;
    if (++mN == 0) {
      s = 1;
    } else {
      s = 0;
      for (int k = 0; k < mN; ++k) {
        s += b(mN, get(k).longValue());
      }
    }
    return Z.valueOf(s);
  }
}

