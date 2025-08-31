package irvine.oeis.a386;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386992 Irregular triangle read by rows: T(n,k) is the number of nonprimes in the k-th 2-dense sublist of divisors of n, with n &gt;= 1, k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A386992 extends Sequence1 {

  private final LinkedList<Integer> mA = new LinkedList<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final Z[] d = Jaguar.factor(++mN).divisorsSorted();
      int c = 1;
      for (int k = 1; k < d.length; ++k) {
        if (d[k].compareTo(d[k - 1].multiply2()) > 0) {
          mA.add(c);
          c = d[k].isProbablePrime() ? 0 : 1;
        } else if (!d[k].isProbablePrime()) {
          ++c;
        }
      }
      mA.add(c);
    }
    return Z.valueOf(mA.pollFirst());
  }
}

