package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061025 a(n) = prime(n-1)! * prime(n)!.
 * @author Sean A. Irvine
 */
public class A061025 extends A000040 {

  private Z mF = super.next(); // 2
  private long mM = 3;

  {
    setOffset(2);
  }

  @Override
  public Z next() {
    final Z t = mF;
    final long p = super.next().longValueExact();
    while (mM <= p) {
      mF = mF.multiply(mM);
      ++mM;
    }
    return t.multiply(mF);
  }
}
