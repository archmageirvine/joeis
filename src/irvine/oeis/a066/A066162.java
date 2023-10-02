package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a002.A002145;

/**
 * A066162 Let p be a prime of the form 4a-1; sequence gives (q!^2-1)/p where q = (p-1)/2.
 * @author Sean A. Irvine
 */
public class A066162 extends A002145 {

  private Z mF = Z.ONE;
  private long mM = 2;

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    final long q = (p - 1) / 2;
    while (mM <= q) {
      mF = mF.multiply(mM * mM);
      ++mM;
    }
    return mF.subtract(1).divide(p);
  }
}
