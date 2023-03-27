package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062321 a(1) = 1; a(n) = gcd {n*(n+1), a(n-1) * (a(n-1) + 1)} for n &gt; 1.
 * @author Sean A. Irvine
 */
public class A062321 extends Sequence1 {

  private Z mA = null;
  private long mN = 1;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : Z.valueOf(++mN).multiply(mN + 1).gcd(mA.multiply(mA.add(1)));
    return mA;
  }
}
