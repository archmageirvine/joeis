package irvine.oeis.a388;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicArray;

/**
 * A080910.
 * @author Sean A. Irvine
 */
public class A388859 extends Sequence0 {

  private long mN = -1;
  private final LongDynamicArray<Z> mA = new LongDynamicArray<>();
  {
    mA.set(0, Z.SIX);
    mA.set(1, Z.ONE);
  }
  private int mI = 1;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == null) {
      ++mI;
      final IntegerPartition part = new IntegerPartition(mI, mI - 1);
      int[] p;
      while ((p = part.next()) != null) {
        Z v = Functions.FACTORIAL.z(mI);
        for (final int k : p) {
          v = v.divide(Functions.FACTORIAL.z(k));
        }
        if (v.bitLength() < 10) {
          final long vv = v.longValue();
          if (mA.get(vv) == null) {
            Z t = Z.ONE;
            Z q = Z.TWO;
            for (int m = 0; m < p.length; ++m, q = Functions.NEXT_PRIME.z(q)) {
              t = t.multiply(q.pow(p[m]));
            }
            mA.set(vv, t.square());
          }
        }
      }
    }
    return mA.get(mN);
  }
}

