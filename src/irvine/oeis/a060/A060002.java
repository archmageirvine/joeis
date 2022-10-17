package irvine.oeis.a060;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.Comparators;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A060002 Digitized partition numbers: numbers with (weakly) increasing digits ordered by sum of their digits then by the numbers themselves.
 * @author Sean A. Irvine
 */
public class A060002 implements Sequence {

  private final TreeSet<int[]> mPart = new TreeSet<>(Comparators.LEXICOGRAPHIC);
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
    for (int k = p.length - 1; k >= 0; --k) {
      if (p[k] > 9) {
        throw new UnsupportedOperationException("Cannot be represented");
      }
      t = t.multiply(10).add(p[k]);
    }
    return t;
  }
}
