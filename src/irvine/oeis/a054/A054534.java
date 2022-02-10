package irvine.oeis.a054;

import irvine.math.IntegerUtils;
import irvine.math.Mobius;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054534 Square array giving Ramanujan sum T(n,k) = c_k(n) = Sum_{m=1..k, (m,k)=1} exp(2 Pi i m n / k), read by antidiagonals upwards (n &gt;= 1, k &gt;= 1).
 * @author Sean A. Irvine
 */
public class A054534 implements Sequence {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 1) {
      mM = ++mN;
    }
    final int k = mN - mM + 1;
    return Integers.SINGLETON.sumdiv(IntegerUtils.gcd(mM, k), d -> Z.valueOf((long) d * Mobius.mobius(k / d)));
  }
}

