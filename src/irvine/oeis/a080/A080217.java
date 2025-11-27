package irvine.oeis.a080;

import java.util.HashSet;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080217 a(n) is the number of distinct values taken by binomial(n,j) mod j for j in [1..n].
 * @author Sean A. Irvine
 */
public class A080217 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> set = new HashSet<>();
    for (long k = 1; k <= mN; ++k) {
      set.add(Binomial.binomial(mN, k, k));
    }
    return Z.valueOf(set.size());
  }
}

