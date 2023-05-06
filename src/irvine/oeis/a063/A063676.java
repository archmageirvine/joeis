package irvine.oeis.a063;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A063676 a(1) = 1 and for n &gt; 1 let a(n) = a(n-1) + m, where m is the arithmetic mean of the largest subset of all predecessors such that m is an integer and m is maximal.
 * @author Sean A. Irvine
 */
public class A063676 extends Sequence1 {

  private Z[] mA = {};

  @Override
  public Z next() {
    if (mA.length == 0) {
      mA = new Z[] {Z.ONE};
      return Z.ONE;
    } else {
      final int n = mA.length;
      mA = Arrays.copyOf(mA, n + 1);
      Z max = Z.ZERO;
      final Z limit = Z.ONE.shiftLeft(n);
      Z start = limit.subtract(1); // try all elements first
      while (true) {
        for (Z k = start; k.compareTo(limit) < 0; k = ZUtils.swizzle(k)) {
          Z s = Z.ZERO;
          int c = 0;
          for (int i = 0; i < k.bitLength(); ++i) {
            if (k.testBit(i)) {
              s = s.add(mA[i]);
              ++c;
            }
          }
          if (s.mod(c) == 0) {
            final Z m = s.divide(c);
            if (m.compareTo(max) > 0) {
              max = m;
            }
          }
        }
        if (max.signum() > 0) {
          mA[n] = mA[n - 1].add(max);
          return mA[n];
        }
        start = start.divide2(); // try one less element
      }
    }
  }
}
