package irvine.oeis.a048;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.Comparators;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048996 Irregular triangle read by rows. Preferred multisets: numbers refining A007318 using format described in A036038.
 * @author Sean A. Irvine
 */
public class A048996 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private final TreeSet<int[]> mA = new TreeSet<>(Comparators.LEXICOGRAPHIC);
  protected int mN = 0;
  private int[] mC;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final IntegerPartition part = new IntegerPartition(++mN);
      int[] p;
      while ((p = part.next()) != null) {
        mA.add(Arrays.copyOf(p, p.length));
      }
      mC = new int[mN + 1];
    }
    IntegerPartition.toCountForm(mA.pollFirst(), mC);
    Z prod = Z.ONE;
    Z sum = Z.ZERO;
    for (final int c : mC) {
      sum = sum.add(c);
      prod = prod.multiply(mF.factorial(c));
    }
    return mF.factorial(sum.intValueExact()).divide(prod);
  }
}

