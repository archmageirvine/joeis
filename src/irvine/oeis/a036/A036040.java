package irvine.oeis.a036;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.Comparators;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036040 Irregular triangle of multinomial coefficients, read by rows (version 1).
 * @author Sean A. Irvine
 */
public class A036040 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private final TreeSet<int[]> mA = new TreeSet<>(Comparators.ABRAHAM_STEGUN);
  private int mN = 0;
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
    for (int k = 1; k < mC.length; ++k) {
      prod = prod.multiply(mF.factorial(k).pow(mC[k]).multiply(mF.factorial(mC[k])));
    }
    return mF.factorial(mN).divide(prod);
  }
}

