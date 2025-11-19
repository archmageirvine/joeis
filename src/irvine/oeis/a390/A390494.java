package irvine.oeis.a390;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390494 Irregular triangle read by rows: T(n,k) is the sum of nonprime numbers in the k-th 2-dense sublist of divisors of n, with n &gt;= 1, k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A390494 extends Sequence1 {

  private final LinkedList<Z> mA = new LinkedList<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final Z[] d = Jaguar.factor(++mN).divisorsSorted();
      Z c = Z.ONE;
      for (int k = 1; k < d.length; ++k) {
        if (d[k].compareTo(d[k - 1].multiply2()) > 0) {
          mA.add(c);
          c = !d[k].isProbablePrime() ? d[k] : Z.ZERO;
        } else if (!d[k].isProbablePrime()) {
          c = c.add(d[k]);
        }
      }
      mA.add(c);
    }
    return mA.pollFirst();
  }
}

