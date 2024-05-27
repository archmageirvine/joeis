package irvine.oeis.a069;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069876 a(1) = 1, a(2) = 2^2 + 3^2; a(n) = (k-n+1)^n + (k-n)^n + ....(k-1)^n + k^n, where k = n(n+1)/2.
 * @author Sean A. Irvine
 */
public class A069876 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final int t = ++mN * (mN + 1) / 2;
    return Integers.SINGLETON.sum(t - mN + 1, t, k -> Z.valueOf(k).pow(mN));
  }
}

