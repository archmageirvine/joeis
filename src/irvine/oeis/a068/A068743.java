package irvine.oeis.a068;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.Comparators;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068743 Digitized partition numbers: numbers with (weakly) decreasing digits ordered by sum of their digits then by the numbers themselves.
 * @author Sean A. Irvine
 */
public class A068743 extends Sequence0 {

  private final TreeSet<int[]> mPart = new TreeSet<>(Comparators.INCREASING_LENGTH_DECREASING_VALUE);
  private int mN = -1;

  @Override
  public Z next() {
    if (mPart.isEmpty()) {
      final IntegerPartition part = new IntegerPartition(++mN);
      int[] p;
      while ((p = part.next()) != null) {
        mPart.add(Arrays.copyOf(p, p.length));
      }
    }
    final int[] p = mPart.pollFirst();
    Z t = Z.ZERO;
    long mul = 10;
    if (p.length > 0) {
      while (mul <= p[0]) {
        mul *= 10;
      }
    }
    long down = mul / 10;
    for (final int v : p) {
      if (v < down) {
        mul = down;
        down /= 10;
      }
      t = t.multiply(mul).add(v);
    }
    return t;
  }
}
