package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036035 Least integer of each prime signature, in graded (reflected or not) colexicographic order of exponents.
 * @author Sean A. Irvine
 */
public class A036035 implements Sequence {

  private static final Fast mPrime = new Fast();
  private int mN = -1;
  private final TreeSet<int[]> mA = new TreeSet<>((a, b) -> {
    final int c = Integer.compare(a.length, b.length);
    if (c != 0) {
      return c;
    }
    for (int k = a.length - 1; k >= 0; --k) {
      final int ck = Integer.compare(a[k], b[k]);
      if (ck != 0) {
        return ck;
      }
    }
    return 0;
  });

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      if (++mN == 0) {
        return Z.ONE;
      }
      int[] part;
      final IntegerPartition integerPartition = new IntegerPartition(mN);
      while ((part = integerPartition.next()) != null) {
        mA.add(part);
      }
    }
    Z prod = Z.ONE;
    Z p = Z.TWO;
    for (int v : mA.pollFirst()) {
      prod = prod.multiply(p.pow(v));
      p = mPrime.nextPrime(p);
    }
    return prod;
  }
}

