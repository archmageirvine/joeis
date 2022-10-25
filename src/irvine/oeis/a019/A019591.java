package irvine.oeis.a019;

import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A019591 Grundy function of game in which each player has to divide precisely one set of coins into two subsets of different sizes.
 * @author Sean A. Irvine
 */
public class A019591 extends MemorySequence {

  {
    setOffset(1);
    add(null); // skip 0th
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.ZERO;
    }
    final HashSet<Long> s = new HashSet<>();
    for (int k = 1; k < (n + 1) / 2; ++k) {
      s.add(get(k).or(get(n - k)).longValueExact());
    }
    return Z.valueOf(LongUtils.mex(s));
  }
}
