package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001284 Numbers of form <code>m*k</code> with <code>m+1 &lt;= k &lt;= 2m-1</code>.
 * @author Sean A. Irvine
 */
public class A001284 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final Z[] d = Cheetah.factor(++mN).divisorsSorted();
      // Think of n = d[k] * d[j], want a case where d[k] < d[j] <= 2 * d[k] - 1
      // First condition is satisfied by order on loop, second by explicit check
      for (int k = 1, j = d.length - 2; k < j; ++k, --j) {
        assert d[j].multiply(d[k]).longValue() == mN;
        if (d[j].longValue() <= d[k].longValue() * 2 - 1) {
          //System.out.println("X: " + d[j] + " " + d[k]);
          return Z.valueOf(mN);
        }
      }
    }
  }

}
