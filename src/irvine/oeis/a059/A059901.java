package irvine.oeis.a059;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.Comparators;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059901 Partitions encoded by prime factorization. The partition [P1+P2+P3+...] with P1&gt;=P2&gt;=P3&gt;=... is encoded as 2^P1 * 3^P2 * 5^P3 *...
 * @author Sean A. Irvine
 */
public class A059901 extends Sequence0 {

  private final Fast mPrime = new Fast();
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
    final int[] part = mPart.pollFirst();
    Z p = Z.ONE;
    Z res = Z.ONE;
    for (final int v : part) {
      p = mPrime.nextPrime(p);
      res = res.multiply(p.pow(v));
    }
    return res;
  }
}
