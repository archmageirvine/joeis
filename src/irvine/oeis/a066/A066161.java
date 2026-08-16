package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066161 a(n) = ((p-2)! - 1)/p, where p is the n-th prime.
 * @author Sean A. Irvine
 */
public class A066161 extends A000040 {

  private Z mF = Z.ONE;
  private long mM = 2;

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    while (mM <= p - 2) {
      mF = mF.multiply(mM);
      ++mM;
    }
    return mF.subtract(1).divide(p);
  }
}
