package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076963 Lexicographically earliest increasing sequence of relatively prime numbers with nondecreasing number of divisors. a(0) = 1, tau(a(n+1)) &gt;= tau(a(n)) and GCD(a(n),a(n+1)) = 1.
 * @author Sean A. Irvine
 */
public class A076963 extends Sequence0 {

  private Z mA = null;
  private Z mD = Z.ZERO;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    final Z t = mA;
    while (true) {
      mA = mA.add(1);
      if (Functions.GCD.z(t, mA).isOne()) {
        final Z s0 = Functions.SIGMA0.z(mA);
        if (s0.compareTo(mD) >= 0) {
          mD = s0;
          return mA;
        }
      }
    }
  }
}

