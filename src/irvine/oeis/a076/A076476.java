package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076476 Fractions a(n)/n are such that gcd(a(n),n)=1, a(n) &gt; 0 and a(n) is as small as possible so that the partial sums of the fractions have prime numerator. Let a(1)=1.
 * @author Sean A. Irvine
 */
public class A076476 extends Sequence1 {

  private Q mSum = null;
  private long mN = 1;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Q.ONE;
      return Z.ONE;
    }
    ++mN;
    long k = 0;
    while (true) {
      if (Functions.GCD.l(++k, mN) == 1) {
        final Q t = mSum.add(new Q(k, mN));
        if (t.num().isProbablePrime()) {
          mSum = t;
          return Z.valueOf(k);
        }
      }
    }
  }
}
