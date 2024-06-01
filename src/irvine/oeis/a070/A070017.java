package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A070017 Least numbers m such that GCD of two consecutive values of cototients, i.e., gcd(cototient(m+1), cototient(m)) equals 2n - 1.
 * @author Sean A. Irvine
 */
public class A070017 extends Sequence1 {

  private long mN = -1;
  private long mM = 1;
  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();

  @Override
  public Z next() {
    mN += 2;
    while (mFirsts.get(mN) == 0) {
      final long gcd = Functions.GCD.l(Functions.COTOTIENT.l(++mM), Functions.COTOTIENT.l(mM + 1));
      if (mFirsts.get(gcd) == 0) {
        mFirsts.set(gcd, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

