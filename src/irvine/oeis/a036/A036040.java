package irvine.oeis.a036;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036040 Irregular triangle of multinomial coefficients, read by rows (version 1).
 * @author Sean A. Irvine
 */
public class A036040 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private final TreeSet<int[]> mA = new TreeSet<>((a, b) -> {
    final int c = Integer.compare(a.length, b.length);
    if (c != 0) {
      return c;
    }
    for (int k = 0; k < a.length; ++k) {
      final int ck = Integer.compare(b[k], a[k]);
      if (ck != 0) {
        return ck;
      }
    }
    return 0;
  });
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

