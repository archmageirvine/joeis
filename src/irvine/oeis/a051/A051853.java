package irvine.oeis.a051;

import java.util.Arrays;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A051853 Table of solutions to all possible Chinese Remainder Equations x = a1 mod p1, x = a2 mod p2, ..., x = an mod pn, where p1 - pn are the first n primes and each a1 - an varies between 1 and (its respective) p-1, with the leftmost a varying fastest.
 * @author Sean A. Irvine
 */
public class A051853 implements Sequence {

  protected final Fast mPrime = new Fast();
  protected long[] mA = new long[0];

  protected long[] bump(final long[] a) {
    int k = 0;
    for (long p = 2; k < a.length && a[k] < p; ++k, p = mPrime.nextPrime(p)) {
      if (++a[k] < p) {
        return a;
      }
      a[k] = 1;
    }
    final long[] aa = Arrays.copyOf(a, a.length + 1);
    aa[a.length] = 1;
    return aa;
  }

  @Override
  public Z next() {
    mA = bump(mA);
    final Z[] a = new Z[mA.length];
    final Z[] m = new Z[mA.length];
    Z p = Z.TWO;
    for (int k = 0; k < mA.length; ++k, p = mPrime.nextPrime(p)) {
      a[k] = Z.valueOf(mA[k]);
      m[k] = p;
    }
    return ZUtils.chineseRemainderTheorem(a, m);
  }
}
