package irvine.oeis.a385;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078769.
 * @author Sean A. Irvine
 */
public class A385645 extends Sequence1 {

  private long mN = 0;

  private List<Long> build(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    final List<Long> pp = new ArrayList<>();
    pp.add(1L);
    for (final Z p : fs.toZArray()) {
      for (int k = 1; k <= fs.getExponent(p); ++k) {
        pp.add(p.pow(k).longValue());
      }
    }
    return pp;
  }

  @Override
  public Z next() {
    final List<Long> p = build(++mN);
    final HashSet<Long> sums = new HashSet<>();
    for (long s = 1; s < 1L << p.size(); ++s) {
      long t = s;
      long sum = 0;
      for (int k = 0; t != 0; ++k, t >>>= 1) {
        if ((t & 1) != 0) {
          sum += p.get(k);
        }
      }
      sums.add(sum);
    }
    return Z.valueOf(sums.size());
  }
}

