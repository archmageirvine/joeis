package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a052.A052248;
import irvine.util.array.DynamicLongArray;

/**
 * A080190 Smallest prime p such that n applications of f lead form p to 2, where f is the mapping of primes &gt; 2 to primes defined by A052248.
 * @author Sean A. Irvine
 */
public class A080190 extends A000040 {

  private final DirectSequence mF = DirectSequence.forceCreate(2, new A052248());
  private final DynamicLongArray mFirst = new DynamicLongArray();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    while (mFirst.get(mN) == 0) {
      final Z q = super.next();
      Z p = q;
      int cnt = 0;
      while (!Z.TWO.equals(p)) {
        p = mF.a(Functions.PRIME_PI.i(p));
        ++cnt;
      }
      if (mFirst.get(cnt) == 0) {
        mFirst.set(cnt, q.longValueExact());
      }
    }
    return Z.valueOf(mFirst.get(mN));
  }
}

