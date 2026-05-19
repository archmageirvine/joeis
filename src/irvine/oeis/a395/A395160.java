package irvine.oeis.a395;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395160 Irregular triangle read by rows: T(n,k) is the average of the odd numbers of the k-th 2-dense sublist of divisors of n and of its conjugate, with n &gt;= 1, k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A395160 extends Sequence1 {

  private final LinkedList<Long> mA = new LinkedList<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final LinkedList<Long> sums = new LinkedList<>();
      final Z[] d = Jaguar.factor(++mN).divisorsSorted();
      long c = 1;
      for (int k = 1; k < d.length; ++k) {
        if (d[k].compareTo(d[k - 1].multiply2()) > 0) {
          sums.add(c);
          c = d[k].isOdd() ? d[k].longValue() : 0;
        } else if (d[k].isOdd()) {
          c += d[k].longValue();
        }
      }
      sums.add(c);
      final int s = sums.size();
      for (int k = 0; k < s; ++k) {
        mA.add((sums.get(k) + sums.get(s - k - 1)) / 2);
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}

