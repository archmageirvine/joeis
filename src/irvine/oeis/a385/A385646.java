package irvine.oeis.a385;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A078769.
 * @author Sean A. Irvine
 */
public class A385646 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long[] p = ZUtils.toLong(Jaguar.factor(++mN).toZArray());
    final HashSet<Long> sums = new HashSet<>();
    for (long s = 1; s < 1L << p.length; ++s) {
      long t = s;
      long sum = 0;
      for (int k = 0; t != 0; ++k, t >>>= 1) {
        if ((t & 1) != 0) {
          sum += p[k];
        }
      }
      sums.add(sum);
    }
    return Z.valueOf(sums.size());
  }
}

