package irvine.oeis.a384;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384226 Irregular triangle read by rows: T(n,k) is the sum of odd divisors in the k-th 2-dense sublist of divisors of n, with n &gt;= 1, k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A384226 extends Sequence1 {

  private final LinkedList<Z> mA = new LinkedList<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final Z[] d = Jaguar.factor(++mN).divisorsSorted();
      Z sum = Z.ONE; // d[0] == 1
      for (int k = 1; k < d.length; ++k) {
        if (d[k].compareTo(d[k - 1].multiply2()) > 0) {
          mA.add(sum);
          sum = d[k].isOdd() ? d[k] : Z.ZERO;
        } else if (d[k].isOdd()) {
          sum = sum.add(d[k]);
        }
      }
      mA.add(sum);
    }
    return mA.pollFirst();
  }
}

