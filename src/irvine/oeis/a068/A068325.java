package irvine.oeis.a068;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.partitions.FixedLengthPartition;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068325 Self-conjugate digitized partition numbers.
 * @author Sean A. Irvine
 */
public class A068325 extends Sequence0 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = 0; // number of parts

  private void buildLength(final int n) {
    for (int m = n; m <= 9 * n; ++m) {
      final FixedLengthPartition part = new FixedLengthPartition(m, n, 1, 9);
      int[] p;
      while ((p = part.next()) != null) {
        if (Arrays.equals(IntegerPartition.dual(p), p)) {
          Z res = Z.ZERO;
          for (final int v : p) {
            res = res.multiply(10).add(v);
          }
          mA.add(res);
        }
      }
    }
    if (mA.isEmpty()) {
      throw new UnsupportedOperationException();
    }
  }

  @Override
  public Z next() {
    if (mN == 0) {
      buildLength(++mN);
      return Z.ZERO;
    }
    while (mA.isEmpty()) {
      buildLength(++mN);
    }
    return mA.pollFirst();
  }
}
