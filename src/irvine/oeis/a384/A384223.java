package irvine.oeis.a384;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384223 Irregular triangle read by rows: T(n,k) is the sum of the k-th odd divisor and the next even divisors that are less than the next odd divisor of n, with n &gt;= 1, k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A384223 extends Sequence1 {

  private final LinkedList<Z> mA = new LinkedList<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final Z[] d = Jaguar.factor(++mN).divisorsSorted();
      Z sum = Z.ZERO;
      for (final Z z : d) {
        if (z.isOdd()) {
          if (!sum.isZero()) {
            mA.add(sum);
          }
          sum = z;
        } else {
          sum = sum.add(z);
        }
      }
      if (!sum.isZero()) {
        mA.add(sum);
      }
    }
    return mA.pollFirst();
  }
}

