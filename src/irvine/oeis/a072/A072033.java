package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072033 Smallest x &gt; 0 such that gcd(2^x, A004086(2^x)) = 2^n.
 * @author Sean A. Irvine
 */
public class A072033 extends Sequence0 {

  private long mN = -1;
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    Z t = mA;
    long x = ++mN;
    while (true) {
      final Z r = Functions.REVERSE.z(t);
      if (x > 0 && r.mod(mA).isZero() && Functions.GCD.z(t, r).equals(mA)) {
        return Z.valueOf(x);
      }
      t = t.multiply2();
      ++x;
    }
  }
}
