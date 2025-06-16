package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077982 Min(P in Partitions(n), Sum(k in P, d(k))) where d(k) = number of divisors of k (A000005).
 * @author Sean A. Irvine
 */
public class A077982 extends Sequence0 {

  // After David A. Corneth and Antti Karttunen

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 1 ? Z.ONE : Z.ZERO;
    }
    if (Predicates.PRIME.is(mN)) {
      return Z.TWO;
    }
    if (Predicates.PRIME.is(mN - 1) || (Predicates.SQUARE.is(mN) && Predicates.PRIME.is(Functions.SQRT.l(mN)))) {
      return Z.THREE;
    }
    if (Predicates.PRIME.is(mN - 2) || (Predicates.CUBE.is(mN) && Predicates.PRIME.is(Functions.CBRT.l(mN)) || Functions.BIG_OMEGA.l(mN) == 2)) {
      return Z.FOUR;
    }
    final long c = mN & 1;
    final long n = mN - c;
    for (long p = 3; p < n; p = Functions.NEXT_PRIME.l(p)) {
      if (Predicates.PRIME.is(n - p)) {
        return Z.valueOf(4 + c);
      }
    }
    final IntegerPartition part = new IntegerPartition((int) n);
    int[] pi;
    long min = 6;
    while ((pi = part.next()) != null) {
      long sum = 0;
      for (long p : pi) {
        sum += Functions.SIGMA0.l(p);
      }
      if (sum < min) {
        min = sum;
      }
    }
    return Z.valueOf(min);
  }
}

