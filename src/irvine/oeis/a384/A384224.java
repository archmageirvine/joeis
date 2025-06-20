package irvine.oeis.a384;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384224 Irregular triangle read by rows: T(n,k) is the number of divisors in the k-th sublist of the divisors of n formed by the k-th odd divisor and the next even divisors that are less than the next odd divisor of n, with n &gt;= 1, k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A384224 extends Sequence1 {

  private final LinkedList<Integer> mA = new LinkedList<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final Z[] d = Jaguar.factor(++mN).divisorsSorted();
      int c = 0;
      for (final Z z : d) {
        if (z.isOdd()) {
          if (c != 0) {
            mA.add(c);
          }
          c = 1;
        } else {
          ++c;
        }
      }
      if (c != 0) {
        mA.add(c);
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}

