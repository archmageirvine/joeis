package irvine.oeis.a122;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.Comparators;
import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A122401 Subsequence of A074139 omitting values derived from partitions with a part of size 1.
 * @author Sean A. Irvine
 */
public class A122401 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private int mN = -1;
  private final TreeSet<int[]> mA = new TreeSet<>(Comparators.COLEXICOGRAPHIC);

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      if (++mN == 0) {
        return Z.ONE;
      }
      if (mN == 1) {
        ++mN;
      }
      int[] part;
      final IntegerPartition integerPartition = new IntegerPartition(mN);
      while ((part = integerPartition.next()) != null) {
        if (part[part.length - 1] != 1) {
          mA.add(part);
        }
      }
    }
    Z prod = Z.ONE;
    Z p = Z.TWO;
    for (int v : mA.pollFirst()) {
      prod = prod.multiply(p.pow(v));
      p = mPrime.nextPrime(p);
    }
    return Functions.SIGMA0.z(prod);
  }
}

