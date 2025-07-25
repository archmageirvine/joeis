package irvine.oeis.a384;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384227 Irregular triangle read by rows: T(n,k) is the smallest number in the k-th sublist of divisors of n whose terms increase by a factor of at most 2, with n &gt;= 1, k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A384227 extends Sequence1 {

  private final LinkedList<Z> mA = new LinkedList<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final Z[] d = Jaguar.factor(++mN).divisorsSorted();
      mA.add(Z.ONE);
      for (int k = 1; k < d.length; ++k) {
        if (d[k].compareTo(d[k - 1].multiply2()) > 0) {
          mA.add(d[k]);
        }
      }
    }
    return mA.pollFirst();
  }
}

