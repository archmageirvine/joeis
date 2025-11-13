package irvine.oeis.a081;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A081806 Least positive number that can be written using prime factors of n (with repetition) and the operations add and subtract.
 * @author Sean A. Irvine
 */
public class A081806 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final ArrayList<Long> s = new ArrayList<>();
    for (final Z pp : fs.toZArray()) {
      final long p = pp.longValue();
      for (int k = 0; k < fs.getExponent(pp); ++k) {
        s.add(p);
      }
    }
    long min = Long.MAX_VALUE;
    final long lim = 1L << s.size();
    for (long signs = 0; signs < lim; ++signs) {
      long sum = 0;
      long t = signs;
      for (final long v : s) {
        if ((t & 1) == 0) {
          sum += v;
        } else {
          sum -= v;
        }
        t >>>= 1;
      }
      if (sum == 1) {
        return Z.ONE; // Efficiency, we can never beat this solution
      }
      if (sum > 0 && sum < min) {
        min = sum;
      }
    }
    return Z.valueOf(min);
  }
}
