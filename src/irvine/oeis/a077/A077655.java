package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077655 Number of consecutive successors of n having the same number of prime factors as n (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A077655 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    final long omega = Functions.BIG_OMEGA.l(m);
    long cnt = 0;
    while (Functions.BIG_OMEGA.l(++m) == omega) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
