package irvine.oeis.a086;

import java.util.HashSet;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086494 Group the natural numbers such that the sum of the terms of every group has a distinct prime signature not occurring earlier: (1), (2), (3, 4, 5), (6), (7, 8, 9), (10, 11, 12, 13, 14), (15, 16, 17), (18, 19, 20, 21)... Sequence contains the sum of the terms of groups.
 * @author Sean A. Irvine
 */
public class A086494 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    Z v = Z.ZERO;
    do {
      v = v.add(++mN);
    } while (!mSeen.add(FactorUtils.leastPrimeSignature(v)));
    return v;
  }
}

