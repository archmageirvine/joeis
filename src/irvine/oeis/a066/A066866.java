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

  // Computes left to right with respect to the Example picture in the OEIS.

  private int mN = 0;

  private Z rotateLeft(final Z n, final int m) {
    if (n.testBit(m)) {
      return n.multiply2().add(1).and(Z.ONE.shiftLeft(m).subtract(1));
      //return n.multiply2().add(1);
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
    Arrays.fill(v, Z.ONE);
    System.out.println("Patterns: " + Arrays.toString(p));
    for (int i = 1; i < mN; ++i) {
      final Z[] w = new Z[l];
      Arrays.fill(w, Z.ZERO);
      // todo not convinced this is right, the wrap around might need extra step at end rather than in situ like this
      for (int j = 0; j < l; ++j) {
        for (int k = 0; k < l; ++k) {
          if (i == mN - 1) {
            if (p[j].and(p[k]).isZero() && p[j].and(rotateLeft(p[k], mN - 1)).isZero() && rotateLeft(p[j], mN - 1).and(p[k]).isZero()) {
              w[k] = w[k].add(v[j]);
            }
          } else {
            if (p[j].and(p[k]).isZero() && rotateLeft(p[j], mN - 1).and(p[k]).isZero()) {
              w[k] = w[k].add(v[j]);
            }
          }
        }
      }
      v = w;
    }
    Z sum = Z.ZERO;
    for (final Z z : v) {
      sum = sum.add(z);
    }
    return sum;
  }
}
