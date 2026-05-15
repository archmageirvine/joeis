package irvine.oeis.a395;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395653 allocated for Marc LeBrun.
 * @author Sean A. Irvine
 */
public class A395653 extends Sequence1 {

  private final HashMap<String, Long> mCounts = new HashMap<>();
  private long mN = 0;

  private String profile(final long n) {
    final List<String> res = new ArrayList<>();
    for (final Z d : Jaguar.factor(n).divisorsSorted()) {
      res.add(Arrays.toString(FactorUtils.sortedPrimeSignature(d)));
    }
    return res.toString();
  }

  @Override
  public Z next() {
    return Z.valueOf(mCounts.merge(profile(++mN), 1L, Long::sum));
  }
}
