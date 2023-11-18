package irvine.oeis.a066;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066863.
 * @author Sean A. Irvine
 */
public class A066866 extends Sequence1 {

  private int mN = 0;

  private Z rotateLeft(final Z n, final int m) {
    if (n.testBit(m)) {
      return n.multiply2().add(1);
    }
    return n.multiply2();
  }

  private Z rotateRight(final Z n, final int m) {
    if (n.testBit(0)) {
      return n.divide2().setBit(m);
    }
    return n.divide2();
  }

  @Override
  public Z next() {
    ++mN;

    final ArrayList<Z> patterns = new ArrayList<>();
    for (long i = 0; i < (1L << mN); ++i) {
      if ((i & 1) == 0 || (i & (1L << (mN - 1))) == 0) {
        long j = i;
        while (j != 0 && (j & 3) != 3) {
          j /= 2;
        }
        if ((j & 3) != 3) {
          patterns.add(Z.valueOf(i));
        }
      }
    }
    final Z[] p = patterns.toArray(new Z[0]);
    final int l = p.length;
    Z[] v = new Z[l];
    Z sum = Z.ZERO;
    for (int pos = 0; pos < v.length; ++pos) {
      Arrays.fill(v, Z.ZERO);
      v[pos] = Z.ONE;
      for (int i = 1; i < mN; ++i) {
        final Z[] w = new Z[l];
        Arrays.fill(w, Z.ZERO);
        for (int j = 0; j < l; ++j) {
          for (int k = 0; k < l; ++k) {
            if (p[j].and(p[k]).isZero() && rotateLeft(p[j], mN - 1).and(p[k]).isZero()) {
              w[k] = w[k].add(v[j]);
            }
          }
        }
        v = w;
      }
      final Z right = rotateRight(p[pos], mN - 1);
      for (int k = 0; k < l; ++k) {
        if (p[k].and(p[pos]).isZero() && p[k].and(right).isZero()) {
          sum = sum.add(v[k]);
        }
      }
    }
    return sum;
  }
}
