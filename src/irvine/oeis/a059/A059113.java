package irvine.oeis.a059;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059113 Numbers that are the sum of the divisors of two distinct coprime squares.
 * @author Sean A. Irvine
 */
public class A059113 extends Sequence1 {

  private final TreeMap<Z, List<Long>> mA = new TreeMap<>();
  private long mN = 2;
  private Z mS = Z.FOUR;

  @Override
  public Z next() {
    while (true) {
      while (mA.isEmpty() || mA.firstKey().multiply2().compareTo(mS) > 0) {
        final FactorSequence fs = new FactorSequence();
        fs.add(mN, FactorSequence.UNKNOWN, 2);
        final Z sigma = Jaguar.factor(fs).sigma();
        final List<Long> known = mA.get(sigma);
        if (known == null) {
          final ArrayList<Long> lst = new ArrayList<>();
          lst.add(mN);
          mA.put(sigma, lst);
        } else {
          known.add(mN);
        }
        mS = Z.valueOf(++mN).square();
      }
      final Map.Entry<Z, List<Long>> e = mA.pollFirstEntry();
      final List<Long> values = e.getValue();
      if (values.size() > 1) {
        for (long u : values) {
          for (long v : values) {
            if (LongUtils.gcd(u, v) == 1) {
              return e.getKey();
            }
            if (u == v) {
              break;
            }
          }
        }
      }
    }
  }
}

