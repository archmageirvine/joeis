package irvine.oeis.a070;

import java.util.Arrays;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070829 Array showing which primes divide n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A070830 extends Sequence1 {

  private int mN = 0;

  private boolean isWide(final int[] lambda) {
    // Lemma 1 of Chow et al.
    for (int k = 1; k < lambda.length; ++k) {
      if (lambda[lambda.length - k] < k) {
        return false;
      }
    }

    // Proposition 3 of Chow et al.
    // Form and test each lower subpartition
    for (int k = 0; k < lambda.length; ++k) {
      final int[] mu = k == 0 ? lambda : Arrays.copyOfRange(lambda, k, lambda.length);
      final int[] conjMu = IntegerPartition.dual(mu);
      if (!IntegerPartition.ge(mu, conjMu)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final IntegerPartition part = new IntegerPartition(++mN);
    long count = 0;
    int[] p;
    while ((p = part.next()) != null) {
      if (isWide(p)) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}

