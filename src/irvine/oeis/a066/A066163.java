package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a002.A002144;

/**
 * A066163 Let p be a prime of the form 4k+1; sequence gives (q!^2 + 4)/p where q = (p-3)/2.
 * @author Sean A. Irvine
 */
public class A066163 extends A002144 {

  private Z mF = Z.ONE;
  private long mM = 2;

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    final long q = (p - 3) / 2;
    while (mM <= q) {
      mF = mF.multiply(mM * mM);
      ++mM;
    }
    return mF.add(4).divide(p);
  }
}
