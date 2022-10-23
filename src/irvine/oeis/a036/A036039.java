package irvine.oeis.a036;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.Comparators;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036039 Irregular triangle of multinomial coefficients of integer partitions read by rows (in Abramowitz and Stegun ordering) giving the coefficients of the cycle index polynomials for the symmetric groups S_n.
 * @author Sean A. Irvine
 */
public class A036039 extends Sequence1 {

  private final TreeSet<int[]> mA = new TreeSet<>(Comparators.LEXICOGRAPHIC);
  private int mN = 0;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
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
    // A036039(n, m) := n!/ (mul((t)^q(t)*q(t)!, t=1..n));
    IntegerPartition.toCountForm(mA.pollFirst(), mC);
    Z prod = Z.ONE;
    for (int k = 1; k < mC.length; ++k) {
      prod = prod.multiply(Z.valueOf(k).pow(mC[k]).multiply(mF.factorial(mC[k])));
    }
    return mF.factorial(mN).divide(prod);
  }
}
