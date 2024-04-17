package irvine.oeis.a065;

import java.util.List;

import irvine.math.ContinuedFractionUtils;
import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a007.A007305;
import irvine.oeis.a047.A047679;
import irvine.oeis.memory.MemorySequence;

/**
 * A065658 The table of permutations of N, each row induced by the rotation (to the right) of the n-th node in the infinite binary "decimal" fraction tree.
 * @author Sean A. Irvine
 */
public class A065658 extends Sequence0 {

  // After Antti Karttunen

  private long mN = -1;
  private final MemorySequence mSternBrocotNum = MemorySequence.cachedSequence(new A007305().skip(2));
  private final MemorySequence mSternBrocotDen = MemorySequence.cachedSequence(new A047679());

  private Z cfrac2BinExp(final List<Z> c) {
    Z n = Z.ZERO;
    int k = 0;
    for (Z e : c) {
      if (++k == c.size()) {
        e = e.subtract(1);
      }
      final long ee = e.longValueExact();
      n = n.shiftLeft(ee);
      if ((k & 1) == 1) {
        n = n.add(Z.ONE.shiftLeft(ee).subtract(1));
      }
    }
    return n;
  }

  private static int lg(final Z n) {
    return n.bitLength() - 1;
  }

  private Z reflectBinTreePermutation(final Z n) {
    return Z.THREE.shiftLeft(lg(n)).subtract(n).subtract(1);
  }

  protected Z frac2PositionIn01SBTree(final Q r) {
    return reflectBinTreePermutation(cfrac2BinExp(ContinuedFractionUtils.continuedFraction(r.reciprocal())));
  }

  protected Q sternBrocot01Frac(final long n) {
    final long m = n + (1L << LongUtils.log2(n));
    if (m > Integer.MAX_VALUE) {
      throw new UnsupportedOperationException();
    }
    final int m1 = (int) (m - 1);
    return new Q(mSternBrocotNum.a(m1), mSternBrocotDen.a(m1));
  }

  // Implementation is either right or left
  protected Z rotateBinFracNode(final long t, final long n) {
    return frac2PositionIn01SBTree(rotateBinFracNodeX(t, sternBrocot01Frac(n)));
  }

  // Right rotation
  protected Q rotateBinFracNodeX(final long t, final Q x) {
    final Z den = Z.ONE.shiftLeft(LongUtils.log2(t) + 1);
    final Q num = new Q(Z.valueOf(2 * t).subtract(den).add(1));
    if (x.compareTo(num.subtract(1).divide(den)) <= 0 || x.compareTo(num.add(1).divide(den)) >= 0) {
      return x;
    }
    if (x.compareTo(num.subtract(1).multiply(2).add(1).divide(den.multiply(2))) <= 0) {
      return x.subtract(num.subtract(1).divide(den)).multiply(2).add(num.subtract(1).divide(den));
    }
    if (x.compareTo(num.divide(den)) < 0) {
      return x.add(Q.HALF.divide(den));
    }
    return num.divide(den).add(x.subtract(num.subtract(1).divide(den)).divide(2));
  }

  @Override
  public Z next() {
    final long n = ++mN;
    final long t = Functions.TRINV.l(n);
    return rotateBinFracNode(1 + (mN - ((t * (t + 1)) / 2)), ((t * (t + 3) / 2) - mN) + 1);
  }
}
