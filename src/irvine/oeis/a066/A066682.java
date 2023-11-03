package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066682 Indices of badly sieved numbers: a(n) = k if n = A066680(k), otherwise 0.
 * @author Sean A. Irvine
 */
public class A066682 extends A066680 {

  private long mT = super.next().longValueExact();
  private long mM = 0;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mT) {
      mT = super.next().longValueExact();
      return Z.valueOf(++mM);
    }
    return Z.ZERO;
  }
}
